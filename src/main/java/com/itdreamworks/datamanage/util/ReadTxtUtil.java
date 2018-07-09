package com.itdreamworks.datamanage.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadTxtUtil {
  public static List<String> readTxtUtil(MultipartFile file) {
        List<String> list = new ArrayList<>();
        InputStreamReader isr = null;
        try {
            // isr = new InputStreamReader(file.getInputStream(), "UTF-8");
         isr = new InputStreamReader(file.getInputStream(), "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String lineTxt = null;
            while ((lineTxt = br.readLine()) != null) {
                char s =lineTxt.trim().charAt(0);
                if(s==65279){
                    if(lineTxt.length()>1){
                        lineTxt=lineTxt.substring(1);
                    }
                }
                list.add(lineTxt);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("文件读取错误!");
        }
        return list;
    }


}
