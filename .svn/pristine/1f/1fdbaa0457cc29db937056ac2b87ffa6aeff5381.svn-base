package com.tly.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/**
	 * 获取系统时间
	 * @param part 时间格式，如：yyyy-MM-dd
	 * @return
	 */
	public static String getTime(String part){
		SimpleDateFormat sdf = new SimpleDateFormat(part);
		Date today = new Date();
		return sdf.format(today);
	}
	
	/**
	 * 获取默认系统时间 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getTime(){
		return getTime("yyyy-MM-dd HH:mm:ss");
	}
	/**
	 * 获取系统日期 yyyy年MM月dd日
	 * @return
	 */
	public static String getDate(){
		return getTime("yyyy年MM月dd日");
	}
	/**
	 * 获取系统日期 yyyyMMdd
	 * @return
	 */
	public static String getDate2(){
		return getTime("yyyyMMdd");
	}
	/**
	 * 获取系统日期 yyMMdd
	 * @return
	 */
	public static String getDatePart(){
		return getTime("yyMMdd");
	}
	/**
	 * 获取系统日期 yyMM
	 * @return
	 */
	public static String getDatePart2(){
		return getTime("yyMM");
	}
	/**
	 * 将字符串转为时间类型
	 * @param time String 
	 * @param part 时间格式，如：yyyy-MM-dd
	 * @return
	 */
	public static Date getDate(String time, String part){
		SimpleDateFormat sdf = new SimpleDateFormat(part);
		Date date = null;
		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 将字符串转为时间类型，默认格式：yyyy-MM-dd
	 * @param time String 
	 * @return
	 */
	public static Date getDate(String time){
		return getDate(time, "yyyy-MM-dd");
	}
	
	/**
	 * 获取当前日期于周一相差的天数
	 * @return
	 */
	public static int getMondayPlus(){  
	    Calendar day=Calendar.getInstance();  
	    int dayOfWeek=day.get(Calendar.DAY_OF_WEEK);  
	    if(dayOfWeek==1){ //一周中第一天（周日）  
	        return -6;  
	    }else{  
	        return dayOfWeek-2;  
	    }  
	}  
 	 /**
      * 把long 转换成 日期 再转换成String类型
      */
     public String transferLongToDate(String dateFormat, Long millSec) {
         SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
         Date date = new Date(millSec);
         return sdf.format(date);
     }
}
