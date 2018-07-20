package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Employee;
import com.itdreamworks.datamanage.entity.Product;
import com.itdreamworks.datamanage.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    @Select("<script>" +
            "select * from employee "+
            "<where>"+
            "1=1 "+
            "<if test='mobile != null'> "+
            " AND Mobile=#{mobile}"+
            "</if>"+
            "</where>"+
            "</script>")
    List<User> getUserListByCondition(User user);

    @Insert("insert into employee (OrgType,OrgId,Password,Mobile,Email,WeiXin,QQ,RealName,Status,LastLoginDatetime,Mark) values (#{orgType},#{orgId},#{password},#{mobile},#{email},#{weiXin},#{qQ},#{realName},#{status},#{lastLoginDatetime},#{mark})")
    void insertUser(User user);

    @Update("update employee set OrgType=#{orgType},OrgId=#{orgId},Password=#{password},Mobile=#{mobile},Email=#{email},WeiXin=#{weiXin},QQ=#{qQ},RealName=#{realName},Status=#{status},LastLoginDatetime=#{lastLoginDatetime},Mark=#{mark} where Id = #{id}")
    int updateUser(User user);
}