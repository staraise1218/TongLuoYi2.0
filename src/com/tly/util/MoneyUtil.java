package com.tly.util;

import java.math.BigDecimal;

/**
 * 金钱工具类
 * @ClassName MoneyUtil
 * @Author yangweihang
 * @Date 2018年8月25日 下午6:18:00
 */
public class MoneyUtil {
	
	public static final Double DEFAULT = 0.0;
	
	public static final Double ONE = 1.0;
	
	public static final Double FUND = 0.4;
	
	public static final Double YWFUND = 1.0;
	
	public static final Double WXFUND = 3.0;
	
	public static final int STRONE = 1;
	
	public static final int STRTWO = 2;
	
	public static final int STRTHREE = 3;
	
	public static final int STRFOUR = 4;
	
	/**
	 * 判断是否为数字
	 * yangweihang
	 * @Date 2018年8月25日 下午6:17:46
	 * @param str
	 * @return
	 */
	public static boolean isNum(Integer str) {
        try {
            new BigDecimal(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
	
	/**
	* 基金类型
	* yangweihang
	* @date: 2018年9月1日 上午12:01:00
	* @param type
	* @return String
	*/
	public static String type(int key) {
		String str = "";
		switch (key) {
		case STRONE:
			str = "公积金";
			break;
		case STRTWO:
			str = "维修基金";
			break;
		case STRTHREE:
			str = "运维基金";
			break;
		}
		return str;
	}
	
}
