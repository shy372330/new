package com.itdreamworks.datamanage.daoservice;
import com.itdreamworks.datamanage.entity.Device;
import com.itdreamworks.datamanage.entity.DeviceECEMap;
import com.itdreamworks.datamanage.mapper.DeviceECEMapMapper;
import com.itdreamworks.datamanage.mapper.DeviceMapper;
import com.itdreamworks.datamanage.util.ReadTxtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {
    @Autowired
    private DeviceMapper mapper;
    @Autowired
    private DeviceECEMapMapper deviceECEMapMapper;
    @Transactional(rollbackFor = Exception.class)
    //注意：如果连续多次访问的话， 有这条数据那么就不能再去增加关系，以免重复
    public boolean changeDeviceStatus(List<String> deviceSuffixList ){

        try {
            mapper.changeDeviceStatus(deviceSuffixList);
            List<Device> deviceList = mapper.getDeviceByDeviceSuffix(deviceSuffixList);
            List<DeviceECEMap> deviceECEMapList = new ArrayList<>();
               for (int i =0;i<deviceList.size();i++){
               Integer enterpriseId= Integer.valueOf(deviceList.get(i).getDeviceSuffix().substring(0,2));
               Integer deviceId=deviceList.get(i).getId();
               Integer customerId= Integer.valueOf(deviceList.get(i).getDeviceSuffix().substring(2,4));
                DeviceECEMap deviceECEMap = new DeviceECEMap();
                deviceECEMap.setEnterpriseId(enterpriseId);
                deviceECEMap.setDeviceId(deviceId);
                deviceECEMap.setCustomId( customerId);
                deviceECEMapList.add(deviceECEMap);
            }
            deviceECEMapMapper.addDeviceECEMapList(deviceECEMapList);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return false;
        }
    }
    @Transactional(rollbackFor = Exception.class)
    public int batchAdd(MultipartFile file) {
        List<String> list =null;
        List<Device> deviceList = new ArrayList<>();
        try {
             list= ReadTxtUtil.readTxtUtil(file);
            System.out.println(list);
            for (int i =0;i<list.size();i++){
                Device device = new Device();
                device.setAreaId(100101001);
                device.setDeviceType("CTL_NJZJ_IPK2");
                device.setDeviceSuffix(list.get(i).substring(11));
                device.setDeviceNo(list.get(i).substring(0,10));
                device.setDevicePrefix("1");
                String enterpriseId =list.get(i).substring(11,13);
                device.setEnterpriseId(Integer.parseInt(enterpriseId));
                deviceList.add(device);
            }
            mapper.batchAdd(deviceList);
        }catch (DuplicateKeyException e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 1;
        }catch (Exception e ){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 2;
        }
        return 0;
    }

    public Device getDevice(Integer employeeId, String deviceNo) {
        //根据用户的id获取其对应的orgtype和orgId
        //根据用户的id获取其deviceid
        List<Integer> deviceIds=mapper.getDeviceIds(employeeId);
        Device device = mapper.getDeviceByDeviceNo(deviceNo);
        if (deviceIds.contains(device.getId())){
            return device;
        }
        return null;
    }
}
