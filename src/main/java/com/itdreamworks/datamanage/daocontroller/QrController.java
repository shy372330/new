package com.itdreamworks.datamanage.daocontroller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.itdreamworks.datamanage.entity.Device;
import com.itdreamworks.datamanage.util.ClientUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.*;
import java.util.List;

@Controller
@RequestMapping(value = "/text")
public class QrController {
    @GetMapping("/wei")
    public void text(Long start, Long end, @RequestParam(name = "w",defaultValue = "200",required = false) int width,
                     @RequestParam(name = "h",defaultValue = "200",required = false) int height, HttpServletRequest request, HttpServletResponse response) throws Exception {
        MatrixToImageConfig DEFAULT_CONFIG = new MatrixToImageConfig();
        int index = 0;
        String getUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
                "/device/getCodeByList?start=" + start + "&end=" + end;
        String postUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/device/change";

        BufferedImage image2 = new BufferedImage(2440, 800, BufferedImage.TYPE_INT_RGB);

        //获取图形上下文,graphics想象成一个画笔
        Graphics2D graphics = (Graphics2D) image2.getGraphics();
//        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, 2440, 800);

        List<Device> list = ClientUtil.getCode(getUrl);
        List<String> suffixList = new ArrayList<>();
        for (int a = 0; a < list.size(); a++) {
            Device device = list.get(a);
            String content = "http://www.sdcsoft.com.cn/app/gl/gl.apk?id=" + device.getDeviceNo();
            Map<EncodeHintType, Object> config = new HashMap<>();
            config.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            config.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            config.put(EncodeHintType.MARGIN, 0);
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, config);
            BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix, DEFAULT_CONFIG);
            //消除线条锯齿
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics.drawImage(image, 200 * index + 20 * index + 20, 0 + 20, 200, 200, null);
            graphics.setColor(Color.BLACK);
            graphics.drawString(device.getDevicePrefix(), 70 + 200 * index + 20 * index + 20, 235);
            graphics.drawString( device.getDeviceNo()+"-"+device.getDeviceSuffix(),20 + 200 * index + 20 * index + 20, 335);
            index++;
            suffixList.add(device.getDeviceSuffix());
        }
        graphics.dispose();//释放此图形的上下文并释放它所使用的所有系统资源
        response.setDateHeader("expries", -1);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");
        OutputStream os = response.getOutputStream();
        ImageIO.write(image2, "JPEG", os);
        ClientUtil.postCode(postUrl,suffixList);
        os.flush();
        os.close();

    }

}
