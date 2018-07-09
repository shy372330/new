package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Role;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleMapper {
    @Select("select * from Role")
    @ResultType(Role.class)
    List<Role> findAll();

    @Select("select * from Role where RoleId=#{roleId}")
    Role findOneById(@Param("id") int id);

    @Update("update Role set roleName=#{roleName},roleDesc=#{roleDesc} where RoleId = #{roleId}")
    int modifyRole(Role role);

    @Insert("insert into Role (roleName,roleDesc) values (#{roleName},#{roleDesc})")
    int addRole(Role role);

    @Delete("delete from Role where roleId=#{roleId}")
    int delRole(Integer roleId);

    //根据用户id获取对应的角色信息
    @Select("select * from Role r LEFT JOIN UserRole u on u.RoleId = r.RoleId " +
            "LEFT JOIN Employee e on u.UserId = e.Id  where e.id =#{useId}")
    List<Role> findAllByUserId(@Param("userId") int userId);
}
