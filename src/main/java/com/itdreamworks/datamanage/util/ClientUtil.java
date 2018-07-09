package com.itdreamworks.datamanage.util;

import com.alibaba.fastjson.JSONObject;
import com.itdreamworks.datamanage.entity.Device;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientUtil {
    public static List<Device> getCode(String url){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        //实例化get方法
        HttpGet httpget = new HttpGet(url);
        List<Device> list = null;
        //请求结果
        CloseableHttpResponse response = null;
        String content ="";
        try {
            //执行get方法
            response = httpclient.execute(httpget);
            if(response.getStatusLine().getStatusCode()==200){
                if (response.getEntity()!=null){
                content = EntityUtils.toString(response.getEntity(),"utf-8");
                list= JSONObject.parseArray(content, Device.class);
                return list;
                }
                return null;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void postCode(String url,List<String> list){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        //实例化post方法
        HttpPost httppost = new HttpPost(url);
        //请求结果
        try {
            httppost.setEntity(new StringEntity(list.toString(),"utf-8"));
            //执行POST方法
             httpclient.execute(httppost);

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
     /*   return null;*/
    }

    public static void main(String[] args) {
//       String  content= getCode("http://192.168.0.103:8081/device/getCode?deviceSuffix=2323232");http://192.168.0.109:8081/device/getCode?deviceSuffix=0200000002
        List<String> list = new ArrayList<>();

        list.add("0101000001");
        list.add("0101000002");
        list.add("0101000003");
      postCode("http://192.168.0.100:8081/device/change",list);


    }
}
