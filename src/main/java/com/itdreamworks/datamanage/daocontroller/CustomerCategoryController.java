package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.CustomerCategory;
import com.itdreamworks.datamanage.mapper.CustomerCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerCategoryController {
    @Autowired
    private CustomerCategoryMapper mapper;
    @GetMapping(value = "/CustomerCgList")
    public List<CustomerCategory> getAll(int customerId){
        return mapper.findByCustomerId(customerId);
    }

    /*保存设备*/
    @PostMapping(value = "/saveCustomerCg")
    public boolean addCustomerCategory( CustomerCategory customerCategory) {
        return  mapper.addCustomerCategory(customerCategory)>0;
    }

    /*修改*/
    @PostMapping(value = "/updateCustomerCg")
    public boolean modifyCustomerCategory(CustomerCategory customerCategory) {
     return mapper.modifyCustomerCategory(customerCategory)>0;
    }
    /*删除设备*/
    @PostMapping( "/deteleCustomerCg")
    public boolean deteleCustomerCg(@RequestParam int id) {
        return mapper.deteleCustomerCgById(id) > 0;
    }
}
