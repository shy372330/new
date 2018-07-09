package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.daoservice.DeviceService;
import com.itdreamworks.datamanage.entity.Device;
import com.itdreamworks.datamanage.entity.Token_Dist;
import com.itdreamworks.datamanage.mapper.DeviceMapper;
import com.itdreamworks.datamanage.util.ReadTxtUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@RestController
@RequestMapping(value = "/device")
public class DeviceController {
    @Autowired
    DeviceMapper mapper;
    @Autowired
    DeviceService service;

    @GetMapping(value = "/list")
    public List<Device> getAll() {
        return mapper.findAll();
    }
   //根据传入的编号获取其对应的device信息
    /*@GetMapping(value = "/system")
    public List<String> getDeviceByNo( @RequestParam("uuid") String token){
            List<String> list = Collections.emptyList();
            Token_Dist token_dist =  mapper.findCodeByToken(token);
            if (token_dist==null) return list;
            //根据逗号劈开
            String[] codeArray = token_dist.getCode().split(",");
            //数组转为集合的方式
            list = Arrays.asList(codeArray);
            if (token_dist.getType()==1){
              return   mapper.findDeviceSuffixByEnterId(list);
            }else if(token_dist.getType()==2){
              return  mapper.findDeviceSuffixByCusId(list);
            }else if (token_dist.getType()==3){
                return mapper.findDeviceSuffixByProxy(list);
            }else {
                return list;
            }

    }*/
   @GetMapping(value = "/system")
   public List<String> getDeviceByNo( @RequestParam("uuid") String orgUuid){
       //根据uuid 获取类型
       Integer type= mapper.getTypeByToken(orgUuid);
       if (type==null) return Collections.emptyList();
       String tableName =null;
       if (type==1){
            tableName = "Relation_DeviceEnterMap";
       }else if(type==2){
            tableName="Relation_DeviceCustomerMap";
       }else{
            tableName="Relation_DeviceProxyMap";
       }
       return mapper.findDeviceSuffixByToken(orgUuid,tableName);
   }
    //获取企业对应的device
    @GetMapping(value = "/listByPage")
    public List<Device> getListByPage(Integer enterpriseId,int pageNum,int pageSize) {
        int from =(pageNum-1)*pageSize;
        return mapper.findListByPage(enterpriseId,from,pageSize);

    }
//获取登录账号对应的控制器信息
   @GetMapping("/listByAccount")
    public  List<Device>  getListByAccount(String account,int pageNum,int pageSize ){
      int type=  mapper.getTypeByAccount(account);
      String table = null;
      if (type==1){
          table = "Relation_DeviceEnterMap";
      }else if (type==2){
          table ="Relation_DeviceCustomerMap";
      }else {
          table ="Relation_DeviceProxyMap";
      }
       int from =(pageNum-1)*pageSize;
     // return  null;
       return    mapper.getDeviceInfoByAccount(account,table,from,pageSize);

    }




    @GetMapping(value = "/sell")
    public List<Device> getSell() {
        return mapper.findAllByStatus(Device.STATUS_SELL);
    }
    @GetMapping(value = "/getCode")
    public String getCode(Integer deviceSuffix) {
        return mapper.getCode(deviceSuffix);
    }

    @GetMapping(value = "/getCodeByList")
    public List<Device> getCodeByList(Long start,Long end) {
        return mapper.getAllCode(start,end);
    }

    @PostMapping(value = "/search")
    public List<Device> search(@RequestParam("enterpriseId") int enterpriseId,@RequestParam("manufacturerId") int manufacturerId) {
        return mapper.search(enterpriseId,manufacturerId);
    }
    //根据前四位查找对应的最大值
    @GetMapping(value = "searchMaxNum")
    public Integer serchMaxNum(@RequestParam("prefix") String prefix){
        return mapper.serchMaxNum(prefix);
    }
    @PostMapping(value = "/create")
    public boolean create(Device device) {
        device.setImportDatetime(new Date());
        return mapper.addDevice(device) > 0;
    }
    //批量插入 0表示批量插入成功  1表示插入出现重复 2表示插入其他异常 3表示文件为空 4表示文件内容为空
    @PostMapping(value = "/batchCreat")
    public int batchCreat(MultipartFile file ){
        if (file==null ){
            return 3;
        }
        if (file.getSize()==0){
            return 4;
        }
       return service.batchAdd(file);
    }
    @PostMapping(value = "/modify")
    public boolean modifyDevice(@RequestBody  Device device) {
        return mapper.modifyDevice(device) > 0;
    }
    @PostMapping(value = "/delete")
    public boolean delDevice( @RequestBody Device device) {
        System.out.println(device.getId());
        return mapper.delDevice(device.getId()) > 0;
    }
    @PostMapping(value = "/change")
    public boolean modifyDeviceStatus( @RequestBody String deviceSuffixStr) {
        String suffix= deviceSuffixStr.substring(1,deviceSuffixStr.length()-1).replace(" ","");
       String[] suffixArray= suffix.split(",");
       List<String> suffixList = Arrays.asList(suffixArray);
        return  service.changeDeviceStatus(suffixList) ;
    }
    @PostMapping(value = "/readText")
    public List<String> getReadList( MultipartFile file){
        if (file!=null &&file.getName()!="")
        return ReadTxtUtil.readTxtUtil(file);
        return null;
    }

}
