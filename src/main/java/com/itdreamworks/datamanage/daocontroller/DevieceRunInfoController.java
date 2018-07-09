package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.DeviceRunInfo;
import com.itdreamworks.datamanage.mapper.DeviceRunInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/deviceRunInfo")
public class DevieceRunInfoController {
    @Autowired
    DeviceRunInfoMapper mapper;
    @GetMapping(value = "/list")
    public List<DeviceRunInfo> getAllDeviceRunInfo() {
        return mapper.findAll();
    }

    @GetMapping(value = "/listById")
    public DeviceRunInfo getAllDeviceRunInfoById(Integer id) {
        return mapper.findOneById(id);
    }
    @GetMapping(value = "/delete")
    public boolean deleteDevice(Integer id){
        return mapper.deleteOneById(id)>0;
    }

    @PostMapping(value = "/create")
    public boolean create( @RequestBody DeviceRunInfo deviceRunInfo) {
        return mapper.addDeviceRunInfo(deviceRunInfo) > 0;
    }


   /* @PostMapping(value = "/modify")
    public boolean modifyDeviceRunInfo(DeviceRunInfo deviceRunInfo) {
        return mapper.modifyDeviceRunInfo(company) > 0;
    }
*/

}
