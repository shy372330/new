package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.DeviceException;
import com.itdreamworks.datamanage.mapper.DeviceExceptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/deviceException")
public class DevieceExceptionController {
    @Autowired
    DeviceExceptionMapper mapper;
    @GetMapping(value = "/list")
    public List<DeviceException> getAllDeviceRunInfo() {
        return mapper.findAll();
    }

  /*  @GetMapping(value = "/listById")
    public DeviceRunInfo getAllDeviceRunInfoById(Integer id) {
        return mapper.findOneById(id);
    }*/


    @PostMapping(value = "/create")
    public boolean create( @RequestBody DeviceException deviceException) {
        return mapper.addDeviceException(deviceException) > 0;
    }


}
