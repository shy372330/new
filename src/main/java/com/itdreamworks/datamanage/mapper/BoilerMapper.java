package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Boiler_Device_View;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BoilerMapper {
    @Select("select * from Boiler_Device_View where customerId = #{customerId} limit #{from},#{pageSize}")
    @ResultType(Boiler_Device_View.class)
    List<Boiler_Device_View>  getBoilerList(@Param("customerId") String customerId ,@Param("from") Integer from ,@Param("pageSize") Integer pageSize);
    @Insert("INSERT into Boiler(customerId,BoilerNo,DeviceNo,BolierType,\n" +
            "BoilerTon,BoilerMedium,BoilerFuel,Status) VALUES(#{customerId},#{boilerNo},#{deviceNo},#{boilerType},\n" +
            "#{boilerTon},#{boilerMedium},#{boilerFuel},#{status})")
    void create(Boiler_Device_View boiler_device_view);
    @Insert("insert into Location(deviceNo,lng,lat) values(#{deviceNo},#{lng},#{lat})")
    void insertLocation(Boiler_Device_View boiler_device_view);
}
