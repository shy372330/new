package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.CustomerCategory;
import com.itdreamworks.datamanage.entity.EnterpriseCategory;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EnterpriseCategoryMapper {

    @Select("select * from EnterpriseCategory where enterpriseId=#{enterpriseId}")
    List<EnterpriseCategory> findByEnterpriseId(@Param("enterpriseId") int enterpriseId);

    @Select("select * from EnterpriseCategory where Id=#{id}")
    EnterpriseCategory findOneById(@Param("id") int id);

    @Update("update EnterpriseCategory set CategoryName=#{categoryName} where id = #{id} ")
    int modifyEnterpriseCategory(CustomerCategory customerCategory);

    @Insert("insert into EnterpriseCategory (EnterpriseId,CategoryName) values (#{enterpriseId},#{categoryName})")
    int addEnterpriseCategory(CustomerCategory customerCategory);

    @Delete("delect from EnterpriseCategory where id =#{id}")
    int deteleEnterpriseCategory(int id);
}
