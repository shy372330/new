package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Boiler_Device_View;
import org.apache.ibatis.annotations.*;
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
    @Update("update Boiler set customerId=#{customerId},BoilerNo=#{boilerNo},DeviceNo=#{deviceNo},BolierType=#{boilerType},\n" +
            "BoilerTon=#{boilerTon},BoilerMedium=#{boilerMedium},BoilerFuel=#{boilerFuel},Status=#{status})  ")
    void modify(Boiler_Device_View boiler_device_view);
    @Update("update Location set  deviceNo=#{deviceNo},lng=#{lng},lat=#{lat}")
    void modifyLocation(Boiler_Device_View boiler_device_view);
}
