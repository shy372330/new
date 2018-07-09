package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.CustomerSaleRecord;
import com.itdreamworks.datamanage.entity.CustomerSaleRecord_CusPro__Location_View;
import com.itdreamworks.datamanage.mapper.CustomerSaleRecord_CusPro__Location_ViewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/csrclv")
public class CustomerSaleRecord_CusPro__Location_ViewController {
    @Autowired
    private  CustomerSaleRecord_CusPro__Location_ViewMapper mapper;
    @GetMapping(value = "/list")
    public List<CustomerSaleRecord_CusPro__Location_View> getAll(String customerId,Integer pageNum,Integer pageSize){
        int from =(pageNum-1)*pageSize;
        return  mapper.findAll(customerId,from,pageSize);
    }

}
