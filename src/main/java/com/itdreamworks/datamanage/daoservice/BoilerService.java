package com.itdreamworks.datamanage.daoservice;

import com.itdreamworks.datamanage.entity.Boiler_Device_View;
import com.itdreamworks.datamanage.entity.Location;
import com.itdreamworks.datamanage.mapper.BoilerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BoilerService {
    @Autowired
    private BoilerMapper mapper;
    @Transactional(rollbackFor = Exception.class)
    public boolean create( Boiler_Device_View boiler_device_view){
        try {
        mapper.create(boiler_device_view);
        mapper.insertLocation(boiler_device_view);
            return true;
        }catch (DuplicateKeyException e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return false;
        }catch (Exception e ){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return false;
        }

    }
}
