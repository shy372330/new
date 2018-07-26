package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    @Select("select em.*," +
            "ro.RoleId as roleId," +
            "ro.RoleName as roleName," +
            "case em.OrgType " +
            "when 1 then com.CompanyName " +
            "when 2 then ent.EnterpriseName " +
            "when 3 then cut.CustomerName " +
            "end as organizationName," +
            "case em.OrgType " +
            "when 1 then com.id " +
            "when 2 then LPAD(cut.Id,2,0)" +
            "when 3 then concat(cut.EnterpriseNo,cut.CustomerNo) " +
            "end as organizationNo " +
            "from employee em " +
            "left join Enterprise ent on ent.Id=em.OrgId " +
            "left join Customer cut on cut.Id=em.OrgId " +
            "left join Company com on com.Id=em.OrgId " +
            "left join userrole ur on em.Id=ur.UserId " +
            "left join role ro on ro.RoleId=ur.RoleId " +
            "where em.mobile=#{loginId} or em.email=#{loginId}")
    User findOneByLoginId(@Param("loginId") String loginId);

    @Select("<script>" +
            "select * from employee "+
            "<where>"+
            "1=1 "+
            "<if test='mobile != null and mobile.length>0 '> "+
            " AND Mobile LIKE CONCAT(CONCAT('%',#{mobile}),'%')"+
            "</if>"+
            "<if test='orgType != 1 and orgType!=0'> "+
            "AND OrgType not in(0,1)  AND  OrgId=#{orgId}"+
            "</if>"+
            "</where>"+
            "</script>")
    List<User> getUserListByCondition(User user);

    @Insert("insert into employee (OrgType,OrgId,Password,Mobile,Email,WeiXin,QQ,RealName,Status,LastLoginDatetime,Mark) values (#{orgType},#{orgId},#{password},#{mobile},#{email},#{weiXin},#{qQ},#{realName},#{status},#{lastLoginDatetime},#{mark})")
    void insertUser(User user);

    @Update("update employee set OrgType=#{orgType},OrgId=#{orgId},Password=#{password},Mobile=#{mobile},Email=#{email},WeiXin=#{weiXin},QQ=#{qQ},RealName=#{realName},Status=#{status},LastLoginDatetime=#{lastLoginDatetime},Mark=#{mark} where Id = #{id}")
    int updateUser(User user);

    @Delete("delete from employee where Id=#{id}")
    void deleteUserById(Integer id);
}