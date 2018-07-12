package com.itdreamworks.datamanage.daocontroller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdreamworks.datamanage.entity.DictionaryValue;
import com.itdreamworks.datamanage.mapper.DictionaryValueMapper;
import com.itdreamworks.datamanage.util.Result;
import com.itdreamworks.datamanage.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/dictionaryvalue")
public class DictionaryValueController {

    @Autowired
    private DictionaryValueMapper dictionaryValueMapper;

    @GetMapping(value = "/dictionaryvaluelist")
    public List<DictionaryValue>  getDictionaryValueList(){
        return  dictionaryValueMapper.getDictionaryValueList();
    }

    @GetMapping(value = "/dictionaryvaluelistbytype")
    public Result getDictionaryValueListByType(String type){
        return  ResultGenerator.genSuccessResult(dictionaryValueMapper.getDictionaryValueListByType(type));
    }

}
