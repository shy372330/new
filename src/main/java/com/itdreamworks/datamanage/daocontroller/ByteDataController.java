package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.client.TemplateClient;
import com.itdreamworks.datamanage.util.Result;
import com.itdreamworks.datamanage.util.ResultGenerator;
import feign.Feign;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/bytedata")
public class ByteDataController {

    /**
     * 获得字节数据
     * @param deviceNo
     * @return
     */
    @PostMapping( "/getbytedata")
    public byte[] getByteData(@RequestParam String deviceNo) {
        TemplateClient client =Feign.builder().target(TemplateClient.class, String.format("%s%s","http://39.106.168.77:8080","/device/get"));
        Map<String,String> map=new HashMap<>();
        map.put("id",deviceNo);
        return client.post(map);
    }
}
