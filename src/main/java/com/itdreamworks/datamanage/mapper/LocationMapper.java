package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.BaseArea;
import com.itdreamworks.datamanage.entity.EnterpriseSaleRecord;
import com.itdreamworks.datamanage.entity.Location;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LocationMapper {

    @Select("select * from Location where parentid=#{parentId}")
    @ResultType(Location.class)
    List<BaseArea> findLocationList(@Param("parentId") int parentId);


}
