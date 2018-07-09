package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.Location;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    @RequestMapping("/create")
    public boolean create(Location location){

        return false;
    }

    @RequestMapping("/modify")
    public boolean modify(Location location){
        return false;
    }
    @RequestMapping("/list")
    public List<Location> getLocation(@RequestParam("account") String account){

        return null;
    }
}
