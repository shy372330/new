package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.BaseArea;
import com.itdreamworks.datamanage.entity.Device;
import com.itdreamworks.datamanage.mapper.BaseAreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseAreaController {
    @Autowired
    private BaseAreaMapper baseAreaMapper;

    @GetMapping(value = "/baseArea")
    public List<BaseArea>  getBaseArea(Integer parentId){
        return  baseAreaMapper.findBaseAreaList(parentId);

    }
}
