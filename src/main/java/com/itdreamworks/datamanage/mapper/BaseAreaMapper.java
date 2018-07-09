package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.BaseArea;
import com.itdreamworks.datamanage.entity.Company;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BaseAreaMapper {

    @Select("select * from Base_Area where parentid=#{parentId}")
    List<BaseArea> findBaseAreaList(@Param("parentId") int parentId);


}
