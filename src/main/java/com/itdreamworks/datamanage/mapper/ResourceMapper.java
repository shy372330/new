package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Resource;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ResourceMapper {

    @Select("select * from Resource re " +
            "LEFT JOIN RoleResource rr on rr.ResId = re.ResId " +
            "LEFT JOIN UserRole ur on rr.RoleId = ur.RoleId " +
            "LEFT JOIN Employee ee on ee.Id = ur.UserId " +
            "where ee.Mobile=#{account} or ee.QQ=#{account}")
    List<Resource> getResourceByAccount(@Param("account") String account );

    @Select("<script>" +
            "select * from Resource "+
            "<where>"+
            "1=1 "+
            "</where>"+
            " order by Sort asc"+
            "</script>")
    List<Resource> getResourceListByCondition(Resource resource);

    @Select("select * from Resource where ResId=#{resId}")
    Resource findOneById(@Param("resId") int resId);

    @Update("update Resource set ResName=#{resName},PId=#{pId} ,URL=#{url},PageUrl=#{pageUrl},Hidden=#{hidden},Permission=#{permission},Sort=#{sort} where ResId=#{resId}")
    void updateResource(Resource resource);

    @Insert("insert into Resource (ResName,PId,URL,PageUrl,Hidden,Permission,Sort) values (#{resName},#{pId},#{url},#{pageUrl},#{hidden},#{permission},#{sort})")
    void insertResource(Resource resource);

    @Delete("delete from Resource where ResId=#{resId}")
    void deleteResourceById(Integer resId);

    @Select("<script> select ce.* from Resource ce\n" +
            "    LEFT JOIN RoleResource ro on ro.ResId = ce.ResId\n"+
            "    LEFT JOIN Role le on le.RoleId = ro.RoleId\n" +
            "    where le.RoleId in <foreach collection=\"list\" item=\"roleId\"\n" +
            "    open=\"(\" close=\")\" separator=\",\"> #{roleId} </foreach></script>")
    List<Resource> getAllByRoleIds(@Param("list") List<Integer> roleIds);

    @Select("select re.Permission from Resource re \n" +
            "LEFT JOIN RoleResource rr on rr.ResId = re.ResId\n" +
            "LEFT JOIN UserRole ur on rr.RoleId = ur.RoleId\n" +
            "LEFT JOIN Employee ee on ee.Id = ur.UserId \n" +
            "where ee.id=#{id} and re.Permission  is not null")
    List<String> findPermissionById(int id);
}
