package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Device;
import com.itdreamworks.datamanage.entity.Token_Dist;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeviceMapper {
    String deviceName ="Device";
    @Select("select * from "+deviceName)
    @ResultType(Device.class)
    List<Device> findAll();

    @Select("select * from "+deviceName+" where status=#{status}")
    @ResultType(Device.class)
    List<Device> findAllByStatus(@Param("status") int status);

    @Select("select * from "+deviceName+" where EnterpriseId=#{enterpriseid} and ManufacturerId=#{manufacturerid}")
    @ResultType(Device.class)
    List<Device> search(@Param("enterpriseid") int status, @Param("manufacturerid") int manufacturerid);

    @Select("select * from "+deviceName+" where id=#{id}")
    Device findOneById(@Param("id") int id);

    @Update("update "+deviceName+"set DeviceNo=#{deviceNo},Status=#{status},RunStatus=#{runStatus},NickName=#{nickName} where Id = #{id}")
    int modifyDevice(Device device);
    @Delete("delete from "+deviceName+" where id =#{id}")
    int delDevice(@Param("id") Integer id);
    //批量修改device状态
    @Update("<script>"+
            "update "+deviceName+" set Status=1  where deviceSuffix in "
            +"<foreach collection=\"list\" item=\"deviceSuffix\"  index=\"index\" open=\"(\" close=\")\" separator=\",\">"
            +"#{deviceSuffix} "
            + "</foreach > </script>")
    void changeDeviceStatus(@Param("list") List<String> list);

    @Insert("insert into "+deviceName+" (EnterpriseId,DeviceNo,ManufacturerId,Status,RunStatus,ImportDatetime,NickName) " +
            "values (#{enterpriseId},#{deviceNo},#{manufacturerId},#{status},#{runStatus},#{importDatetime},#{nickName})")
    int addDevice(Device Device);
    //查找最大的编码数
    @Select("select MAX(DeviceSuffix) max from "+deviceName+" where SUBSTR(DeviceSuffix,1,5)=#{prefix}")
    Integer serchMaxNum(String prefix);
    //批量添加device
    @Insert("<script>"+
            "insert into "+deviceName+"(EnterpriseId,AreaId, DeviceNo, DevicePrefix,DeviceSuffix,DeviceType," +
            "ManufacturerId,Status,RunStatus,ImportDatetime,NickName,SaleDateTime) "
            + "values "
            + "<foreach collection =\"list\" item=\"device\"  separator =\",\"> "
            + "(#{device.enterpriseId},#{device.areaId},#{device.deviceNo},1," +
            "#{device.deviceSuffix},#{device.deviceType},1, "+
            "0,0,now(),#{device.nickName},null) "
            + "</foreach > </script>")
    void batchAdd(List<Device> deviceList);

    @Select("select deviceNo from "+deviceName+" where deviceSuffix =#{deviceSuffix}")
     String getCode(@Param("deviceSuffix") int deviceSuffix);

    @Select("select * from +"+deviceName+"+ where  deviceSuffix between #{start} and #{end}")
    List<Device > getAllCode(@Param("start") Long start,@Param("end") Long end);
    //分页查询device信息
    @Select("<script> SELECT * from "+deviceName+" where 1=1 <when test='enterpriseId!=null'>"+
            "AND enterpriseId = #{enterpriseId}"+
            "</when>  limit #{from},#{pageSize} </script>")
    @ResultType(Device.class)
    List<Device> findListByPage(@Param("enterpriseId") Integer enterpriseId,@Param("from") int from, @Param("pageSize")int pageSize);

    @Select("<script> select *  from "+deviceName+" where deviceSuffix in "+
            "<foreach collection=\"list\" item=\"deviceSuffix\" open=\"(\" close=\")\" separator=\",\">"+
            "#{deviceSuffix}</foreach></script>")
    @ResultType(Device.class)
    List<Device> getDeviceByDeviceSuffix(List<String> deviceSuffixList);
    @Select("select d.* from Device_Enterprise_Customer_EndUser_Map p LEFT JOIN Device d on d.Id = p.DeviceId\n" +
            "where CustomId =#{customerId} limit #{from},#{pageSize}}")
    List<Device> findDeviceListByPage(Integer customerId, int from, int pageSize);
    //根据登录用户id获取其device
    @Select("select p.DeviceId from  Device_Employee_Map p left join Employee e on p.EmployeeId =e.Id\n" +
            "where p.EmployeeId=#{employeeId}")
    List<Integer> getDeviceIds(Integer employeeId);
    //根据传入的deviceNo获取其对应的Device
    @Select("select * from Device where deviceNo = #{deviceNo}")
    Device getDeviceByDeviceNo(String deviceNo);
   /* //获取企业类型suffix
    @Select("<script> select deviceSuffix  from Device where  SUBSTRING(DeviceSuffix,1,2) in "+
            "<foreach collection=\"list\" item=\"code\" open=\"(\" close=\")\" separator=\",\">"+
            "#{code}</foreach></script>")
    List<String> findDeviceSuffixByEnterId(List<String> codeList);
    //获取客户类型的控制器suffix
    @Select("<script> select deviceSuffix  from Device where SUBSTRING(DeviceSuffix,1,5) in "+
            "<foreach collection=\"list\" item=\"code\" open=\"(\" close=\")\" separator=\",\">"+
            "#{code}</foreach></script>")
    List<String> findDeviceSuffixByCusId(List<String> codeList);
    //根据token获取全部内容
    @Select("select * from Token_Dict where token=#{token}")
    Token_Dist findCodeByToken(String token);
    //获取代理类型的控制器suffix
    @Select("<script> select e.DeviceSuffix from Device e LEFT JOIN DeviceSuffix_Proxy_Map p on p.DeviceSuffix = e.DeviceSuffix\n" +
            "LEFT JOIN Token_Dict t on t.`Code` = p.Proxy_No where  t.code in "+
            "<foreach collection=\"list\" item=\"code\" open=\"(\" close=\")\" separator=\",\">"+
            "#{code}</foreach></script>")
    List<String> findDeviceSuffixByProxy(List<String> list);*/

   //根据orgUuid查询对应的deviceSuffix
    @Select("select * from ${tableName} p LEFT JOIN Token_Dict t on t.orgUuid = p .orgUuid\n" +
            "where p.orgUuid = #{orgUuid} and p.isValid=1")
    List<String> findDeviceSuffixByToken(@Param("orgUuid")String orgUuid,@Param("tableName") String tableName);
    @Select("select type from Token_Dict where orgUuid =#{orgUuid}  ")
    Integer getTypeByToken(String orgUuid);

    //根据账号获取组织类型
    @Select("select OrgType from Employee where  WeiXin =#{account} or Mobile=#{account}")
    Integer getTypeByAccount(@Param("account") String account);
    //获取账号对应控制器的信息
    @Select("<script>select ce.* from ${table} p \n" +
            "LEFT JOIN Employee e   on p.OrgUuid =e.OrgId \n" +
            "LEFT JOIN Device ce on ce.DeviceSuffix = p.DeviceSuffix\n" +
            "WHERE e.WeiXin =#{account} or e.Mobile=#{account} order by ce.id limit #{from},#{pageSize} </script>")
    List<Device> getDeviceInfoByAccount(@Param("account") String account,@Param("table") String table,
                                        @Param("from") int from ,@Param("pageSize") int pageSize);
}
