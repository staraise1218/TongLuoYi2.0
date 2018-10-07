package com.tly.util;

/**
 * 产品工具类
 * @ClassName ProductUtil
 * @Author yangweihang
 * @Date 2018年8月25日 上午11:46:44
 */
public class ProductUtil {
	
	public static final int ONE = 1;
	
	public static final int TWO = 2;
	
	public static final int THREE = 3;
	
	public static final int FOUR = 4;
	
	
	/**
	 * 库存状态
	 * yangweihang
	 * @Date 2018年8月25日 上午11:46:35
	 * @param key
	 * @return
	 */
	public static String prostatus(Integer key) {
		boolean num = MoneyUtil.isNum(key);
		String str = "";
		if(num) {
			switch (key) {
			case ONE:
				str = "入库";
				break;
			case TWO:
				str = "出库";
				break;
			case THREE:
				str = "报废";
				break;
			}
		}
		return str;
	}
	
	/**
	 * 设备来源
	 * yangweihang
	 * @Date 2018年8月25日 上午11:50:06
	 * @param key
	 * @return
	 */
	public static String prosource(Integer key) {
		boolean num = MoneyUtil.isNum(key);
		String str = "";
		if(num) {
			switch (key) {
			case ONE:
				str = "新品";
				break;
			case TWO:
				str = "退租";
				break;
			case THREE:
				str = "修复";
				break;
			}
		}
		return str;
	}
	
	/**
	 * 使用形式
	 * yangweihang
	 * @Date 2018年8月25日 下午6:14:23
	 * @param key
	 * @return
	 */
	public static String proform(Integer key) {
		boolean num = MoneyUtil.isNum(key);
		String str = "";
		if(num) {
			switch(key) {
			case ONE:
				str = "租用";
				break;
			case TWO:
				str = "购买";
				break;
			}
		}
		return str;
	}
	
	/**
	 * 设备状态
	 * yangweihang
	 * @Date 2018年8月25日 下午6:26:43
	 * @param key
	 * @return
	 */
	public static String propestatus(Integer key) {
		boolean num = MoneyUtil.isNum(key);
		String str = "";
		if(num) {
			switch(key) {
			case ONE:
				str = "未使用";
				break;
			case TWO:
				str = "待使用";
				break;
			case THREE:
				str = "使用中";
				break;
			case FOUR:
				str = "故障";
				break;
			}
		}
		return str;
	}
	
}
