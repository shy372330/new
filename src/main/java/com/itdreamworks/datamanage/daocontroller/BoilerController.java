package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.daoservice.BoilerService;
import com.itdreamworks.datamanage.entity.Boiler_Device_View;
import com.itdreamworks.datamanage.mapper.BoilerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/boiler")
public class BoilerController {
    @Autowired
    private BoilerMapper boilerMapper;
    @Autowired
    private BoilerService boilerService;
    @RequestMapping("/listByPage")
    public List<Boiler_Device_View> getListByPage(String customerId,Integer pageNum,Integer pageSize){
        if (pageNum==0) return Collections.emptyList();
        Integer from = (pageNum-1)*pageSize;
        return boilerMapper.getBoilerList(customerId,from,pageSize);
    }
    @PostMapping("/add")
    public boolean create(@RequestBody Boiler_Device_View boiler_device_view){
        return boilerService.create(boiler_device_view);
    }
    @PostMapping("/modify")
    public boolean modify(@RequestBody Boiler_Device_View boiler_device_view){
        return boilerService.modify(boiler_device_view);
    }
}
