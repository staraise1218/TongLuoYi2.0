package com.tly.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContext;

import com.alibaba.fastjson.JSONObject;
import com.sun.glass.ui.Application;
import com.tly.controller.ImgController;
import com.tly.controller.MemberController;


/**
 * 生成带参数二维码（微信小程序）
 * @author 川
 * 10点11分
 */
public class CreateQRcode {
	
	private final static String appid = "";
	private final static String secret = "";
    /**
     * 生成二维码 用的时候需要先判断是否以前生成过此用户的二维码（用路径判断）
     * @param scene 要set的参数
     * @param accessToken 令牌（获取）
     * @param page 显示的页面
     * @param width 大小
     * @param auto_color 样式
     * @param wxid 用户微信id
     * @param application 
     * @return 二维码路径
     */
    public static String getqrCode(String scene, String accessToken,String page,Integer width,Boolean auto_color,String wxid, ServletContext application) {
        InputStream sendPost = null;
        OutputStream outputStream = null;
        String memPicPath = "";
        try {
        	//生成永久无限制数量二维码固定路径（accessToken通过获取）
            String url = "https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token="+accessToken;
            //set参数
            JSONObject param = new JSONObject();
            param.put("scene", scene);
            param.put("page", page);
            param.put("width", width);
            param.put("auto_color", auto_color);
            //发送post请求 返回输入流
            sendPost = sendPost(url,param);
            String realPath1 = application.getRealPath("/images/ewm/member/");
            memPicPath = realPath1 + "memewm" + wxid + ".jpg";//此路径需要更改（可以用传参方式）
            System.out.println("路径位置："+memPicPath);
            //创建一个二维码保存路径
            File file = new File(memPicPath);
            //创建文件
            if (!file.exists()) {
				file.createNewFile();
			}
            outputStream = new FileOutputStream(file);
            int len = 0;
            byte[] buf = new byte[1024];
            //将文件写在服务器路径
            while ((len = sendPost.read(buf, 0, 1024)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.flush();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if(sendPost != null){
                try {
                	sendPost.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return memPicPath;    
    }
    /**
     * 发送post请求
     * @param url 请求路径
     * @param param 参数
     * @return 输入流
     */
    public static InputStream sendPost(String url, JSONObject param) {
        PrintWriter out = null;
        InputStream in = null;
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type", "application/json");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            in = conn.getInputStream();
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        return in;
    }  
    /**
     * 获取AccessToken
     * @return AccessToken
     */
    public static String getAccessToken() {
    	String readLine = "";
    	String accessToken = "";
    	JSONObject jsStr = null;
        try {
			URL realUrl = new URL("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appid + "&secret=" + secret);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			InputStream sendPost = conn.getInputStream();
			BufferedReader bf = new BufferedReader(new InputStreamReader(sendPost));
			while(bf.read() != -1) {
			    readLine = bf.readLine();
			}
			sendPost.close();
			bf.close();
		    jsStr = JSONObject.parseObject("{"+readLine);
		} catch (Exception e) {
			// TODO: handle exception
		}
        accessToken = jsStr.getString("access_token");
		return accessToken;
	}
    
    /**
     * 定时器 一个半小时生成一次accessToken
     * @return 
     */
    public static void timeerAccessToken() {
    	System.out.println("启动定时器");
    	Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
            	MemberController.accessToken = getAccessToken();
            }
        }, 0,60*1000*90);
	}
    /**
     * 查看文件是否存在
     * @return 存在返回true
     * @param wxid 用户微信id
     */
    public static String fileExists(String wxid,ServletContext application) {
    	String b = "";
        String realPath1 = application.getRealPath("/images/ewm/member/");
        String memPicPath = realPath1 + "memewm" + wxid + ".jpg";
    	File file = new File(memPicPath);
    	if (file.exists()) {
			b = memPicPath;
		}else{
			b = null;
		}
		return b;
	}
}
