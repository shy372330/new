package com.itdreamworks.datamanage.daocontroller;

import com.alibaba.fastjson.JSONObject;
import com.itdreamworks.datamanage.client.TemplateClient;
import com.itdreamworks.datamanage.util.Result;
import com.itdreamworks.datamanage.util.ResultGenerator;
import feign.Feign;
import org.apache.ibatis.annotations.ResultType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
    @RequestMapping("/bytedata")
public class ByteDataController {

    /**
     * 获得字节数据
     * @param deviceNo
     * @return
     */
    @PostMapping( value = "/getbytedata")
    public Object getByteData(@RequestParam String deviceNo) {
        byte[] byteData={1,3,-16,80,76,6,5,35,85,0,1,0,0,0,0,0,2,0,0,0,2,127,-1,127,-1,127,-1,127,-1,127,-1,127,-1,127,-1,62,-48,76,-46,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,63,-128,0,0,65,-64,0,0,64,0,0,0,64,0,0,0,63,76,-52,-51,63,51,51,51,63,25,-103,-102,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,127,-1,-1,-1,0,0,0,1,0,0,0,0,0,0,127,-1,127,-1,127,-1,127,-1,127,-1,127,-1,127,-1,127,-1,127,-1,127,-1,127,-1,127,-1,0,0,0,0,0,0,0,0,0,0,-51,49,1,3,-16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-116,-37 };
        if(!deviceNo.equals("0101000021")){
            TemplateClient client =Feign.builder().target(TemplateClient.class, String.format("%s%s","http://39.106.168.77:8080","/device/get"));
            Map<String,String> map=new HashMap<>();
            map.put("id",deviceNo);
            byteData=client.post(map);
        }
        return JSONObject.toJSON(byteData);
    }
}
