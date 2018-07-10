package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Location;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LocationMapper {

    @Select("select n.* from Location n LEFT JOIN Boiler r on n.DeviceNo =r.DeviceNo\n" +
            "where r.customerId=#{customerId}")
    @ResultType(Location.class)
    List<Location> findLocationList(@Param("customerId") String customerId);


}
