package com.tly.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.glass.ui.Application;

@Controller
public class ImgController {
	/**
     * 通过url请求返回图像的字节流
     */
    @RequestMapping("/icon")
    public void getIcon(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
    	String img = request.getParameter("img");
    	String realPath = request.getSession().getServletContext().getRealPath("/ewm") +  "/"+img+".jpg";
		File file = new File(realPath);
		// 判断文件是否存在如果不存在就返回默认图标
		if (!(file.exists() && file.canRead())) {
			file = new File(realPath);
		}
		FileInputStream inputStream = new FileInputStream(file);
		byte[] data = new byte[(int) file.length()];
		int length = inputStream.read(data);
		inputStream.close();
		response.setContentType("image/png");
		OutputStream stream = response.getOutputStream();
		stream.write(data);
		stream.flush();
		stream.close();
	}

}
