package com.tly.controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.swetake.util.Qrcode;
import com.tly.model.EquipmentInoutstorage;
import com.tly.model.EquipmentSublist;
import com.tly.service.IEquipmentInoutstorageService;
import com.tly.service.IEquipmentSublistService;
import com.tly.util.ProductUtil;
import com.tly.util.StringTools;

/**
 * 设备子表
 * @ClassName EquipmentSublistController
 * @Author yangweihang
 * @Date 2018年8月25日 上午9:26:14
 */
/*@RestController*/
@Controller
@RequestMapping("/equipmentsublist")
public class EquipmentSublistController {
	
	@Autowired
	private IEquipmentSublistService iess;
	
	@Autowired
	private IEquipmentInoutstorageService ieis;
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private  ServletContext application;
	
	/**
	 * 新增产品并且新增出入库明细批量上传图片
	 * yangweihang
	 * @Date 2018年8月25日 上午11:04:41
	 * @param es
	 * @return
	 */
	@RequestMapping("/insertes")
	public String insertes(EquipmentSublist es,int pcs,@RequestParam("files")MultipartFile[] files) {
		StringBuffer sb1 = new StringBuffer();
		//批量上传图片
		String uploadDir = request.getSession().getServletContext().getRealPath("/img/");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.length; i++) {
            file = files[i];
            if (!file.isEmpty()) {
	            try {
	                byte[] bytes = file.getBytes();
	                stream = new BufferedOutputStream(new FileOutputStream(new File(uploadDir + file.getOriginalFilename())));
	                stream.write(bytes);
	                stream.flush();
	                stream.close();
	                sb1.append(uploadDir + file.getOriginalFilename());
	                sb1.append(",");
	            } catch (Exception e) {
	                stream = null;
	            }
            }
        }
        String rpic = sb1.toString();
       es.setImg(rpic);
		for (int i = 0; i < pcs; i++) {
			//新增产品
			//形成设备编号
			char[] c = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
					'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
			Random r = new Random();
			StringBuffer sb = null;
			while (true) {
				sb = new StringBuffer();
				for (int j = 0; j < 5; j++) {
					int n = r.nextInt(c.length);
					sb.append(c[n]);
				}
				//查询设备编号是否有重复的
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("number", sb.toString());
				EquipmentSublist seles = iess.selectByNumber(map);
				if (seles == null) {
					es.setNumber(sb.toString());
					break;
				}
			}
			//形成的二维码
			try {
				String ewm = ewm(sb.toString());
				es.setEwm(ewm);
			} catch (IOException e) {
				e.printStackTrace();
			}
			int result = iess.insertes(es);
			//新增出入库明细
			if (result > 0) {
				EquipmentInoutstorage ei = new EquipmentInoutstorage();
				ei.setNumber(sb.toString());
				ei.setStatus(ProductUtil.ONE);
				ei.setSource(ProductUtil.ONE);
				ieis.insertei(ei);
			} 
		}
		return selectByProduct(null);
	}
	
	/**
	 * 产品管理
	 * yangweihang
	 * @Date 2018年8月25日 下午5:29:32
	 * @param number
	 * @return
	 */
	@RequestMapping("/selectByProduct")
	public String selectByProduct(String number) {
		Map<String,Object> map = new HashMap<String,Object>();
		StringTools st = StringTools.getFactory();
		if(!st.isNullOrEmpty(number)) {
			map.put("number", number);
		}
		List<Map<String, Object>> list = iess.selectByProduct(map);
		//转换汉字
		for (Map<String,Object> m : list) {
			//库存状态
			if(!st.isNull(m.get("status"))) {
				String status = ProductUtil.prostatus((int)m.get("status"));
				m.replace("status", status);
			}
			//形式
			if(!st.isNull(m.get("form"))) {
				String form = ProductUtil.proform((int)m.get("form"));
				m.replace("form", form);
			}
			//设备状态
			if(!st.isNull(m.get("pestatus"))) {
				String pestatus = ProductUtil.propestatus((int)m.get("pestatus"));
				m.replace("pestatus", pestatus);
			}
		}
		request.setAttribute("number", number);
		request.setAttribute("list", list);
		return "equipmentsublist/manage";
	}
	
	/**
	 * 修改产品
	 * yangweihang
	 * @Date 2018年8月25日 下午7:24:02
	 * @return
	 */
	@RequestMapping("/updatepro")
	public String updatepro(EquipmentSublist es,String number) {
		int updatepro = iess.updatepro(es);
		return selectByProduct(number);
	}
	
	/**
	 * 批量删除产品
	 * yangweihang
	 * @Date 2018年8月26日 下午12:56:23
	 * @param arr
	 * @return
	 */
	@RequestMapping("/deletepro")
	@ResponseBody
	public String deletepro(Integer[] arr){
		int i = iess.deletepro(arr);
		String result = "1";
		if(i > 0){
			result = "2";
		}
		return result;
	}
	
	
	/**
	 * 生成二维码
	 * @param ewm
	 * @return
	 * @throws IOException
	 */
	public String ewm(String ewm) throws IOException{
	   String realPath = request.getSession().getServletContext().getRealPath("/ewm");
	   String pa = request.getContextPath();
	   File file = new File(realPath);
	   if (!file.exists()) {
		   file.mkdirs();
	   }
	   Qrcode qrcode = new Qrcode();
	   qrcode.setQrcodeErrorCorrect('M');//纠错等级（分为L、M、H三个等级）
	   qrcode.setQrcodeEncodeMode('B');//N代表数字，A代表a-Z，B代表其它字符
	   qrcode.setQrcodeVersion(7);//版本
	   //生成二维码中要存储的信息
	   String qrData = ewm;
	   //设置一下二维码的像素
	   int width = 200;
	   int height = 200;
	   BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	   //绘图
	   Graphics2D gs = bufferedImage.createGraphics();
	   gs.setBackground(Color.WHITE);
	   gs.setColor(Color.BLACK);
	   gs.clearRect(0, 0, width, height);//清除下画板内容
	   
	   //设置下偏移量,如果不加偏移量，有时会导致出错。
	   int pixoff = 2;
	   
	   byte[] d = qrData.getBytes("gb2312");
	   if(d.length > 0 && d.length <120){
		   boolean[][] s = qrcode.calQrcode(d);
		   for(int i=0;i<s.length;i++){
			   for(int j=0;j<s.length;j++){
				   if(s[j][i]){
					   gs.fillRect(j*3+pixoff, i*3+pixoff, 3, 3);
				   }
			   }
		   }
	   }
	   gs.dispose();
	   bufferedImage.flush();
	   ImageIO.write(bufferedImage, "png", new File(realPath+"\\"+ewm+".jpg"));
	   String path = realPath+"\\"+ewm+".jpg";
	   return path;
   }
	
}
