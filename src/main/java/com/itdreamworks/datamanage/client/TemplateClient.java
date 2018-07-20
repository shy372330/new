package com.itdreamworks.datamanage.client;

import feign.QueryMap;
import feign.RequestLine;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Map;

public interface TemplateClient {
    @RequestLine("POST")
    byte[] post(@QueryMap Map<String, String> map);

}
