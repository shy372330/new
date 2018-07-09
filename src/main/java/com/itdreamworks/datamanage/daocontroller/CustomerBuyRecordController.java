package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.EnterpriseSaleRecord;
import com.itdreamworks.datamanage.mapper.CustomerBuyRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CustomerBuyRecordController {
    @Autowired
    private CustomerBuyRecordMapper customerBuyRecordMapper;
    @GetMapping(value = "/enterpriseBuyRecord/list")
    public List<EnterpriseSaleRecord> getAll(Integer customerId) {
        return   customerBuyRecordMapper.getBuyRecord(customerId );
    }

}
