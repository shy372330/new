package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Resource;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ResourceMapper {
    @Select("select * from Resource re \n" +
            "LEFT JOIN RoleResource rr on rr.ResId = re.ResId\n" +
            "LEFT JOIN UserRole ur on rr.RoleId = ur.RoleId\n" +
            "LEFT JOIN Employee ee on ee.Id = ur.UserId \n" +
            "where ee.Mobile=#{account} or ee.QQ=#{account}")
    @ResultType(Resource.class)
    List<Resource> findAll(@Param("account") String account );

    @Select("select * from Resource where ResId=#{resId}")
    Resource findOneById(@Param("resId") int resId);

    @Update("update Resource set ResName=#{resName},PId=#{pId} ,URL=#{url},Permission=#{permission} where ResId=#{resId}")
    int modifyResource(Resource role);

    @Insert("insert into Resource (ResName,PId,URL,Permission) values (#{resName},#{pId},#{url},#{permission})")
    int addResource(Resource resource);

    @Delete("delete from Resource where ResId=#{resId}")
    int delResource(Integer resId);

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
