package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.Location;
import com.itdreamworks.datamanage.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationMapper mapper;

    //根据客户的编号获取所有的区域信息
    @RequestMapping("/list")
    public List<Location> getLocation(@RequestParam("customerId") String customerId){
        return mapper.findLocationList(customerId);
    }
}
