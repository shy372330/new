package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Role;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleMapper {

    @Select("<script>" +
            "select * from Role "+
            "<where>"+
            "1=1 "+
            "<if test='roleName != null and roleName.length>0 '> "+
            " AND RoleName LIKE CONCAT(CONCAT('%',#{roleName}),'%')"+
            "</if>"+
            "</where>"+
            "</script>")
    List<Role> getRoleListByCondition(Role role);

    @Select("select * from Role where RoleId=#{roleId}")
    Role findOneById(@Param("id") int id);

    @Update("update Role set RoleName=#{roleName},RoleDesc=#{roleDesc} where RoleId = #{roleId}")
    void updateRole(Role role);

    @Insert("insert into Role (RoleName,RoleDesc) values (#{roleName},#{roleDesc})")
    void insertRole(Role role);

    @Delete("delete from Role where RoleId=#{roleId}")
    void deleteRoleById(Integer roleId);

    //根据用户id获取对应的角色信息
    @Select("select * from Role r LEFT JOIN UserRole u on u.RoleId = r.RoleId " +
            "LEFT JOIN Employee e on u.UserId = e.Id  where e.id =#{useId}")
    List<Role> findAllByUserId(@Param("userId") int userId);
}
