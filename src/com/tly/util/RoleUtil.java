package com.tly.util;

/**
 * 角色类
 * @author lenovo
 *
 */
public class RoleUtil {
	
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	
	/**
	 * 会员级别
	 * @param ml
	 * @return
	 */
	public static String memberlevel(int ml){
		String result = "";
		switch(ml){
		case ONE:
			result = "普通";
			break;
		case TWO:
			result = "金牌";
			break;
		case THREE:
			result = "钻石";
			break;
		case FOUR:
			result = "超级";
			break;
		}
		return result;
	}
	
	/**
	 * 合伙人级别
	 * @param ml
	 * @return
	 */
	public static String partnerlevel(int ml){
		String result = "";
		switch(ml){
		case ONE:
			result = "普通";
			break;
		case TWO:
			result = "金牌";
			break;
		case THREE:
			result = "钻石";
			break;
		case FOUR:
			result = "超级";
			break;
		}
		return result;
	}
	
	/**
	 * 身份
	 * yangweihang
	 * @Date 2018年8月26日 下午8:15:57
	 * @param key
	 * @return
	 */
	public static String identity(int key){
		String str = "";
		switch (key) {
		case ONE:
			str = "会员";
			break;
		case TWO:
			str = "合伙人";
			break;
		case THREE:
			str = "管理员";
			break;
		case FOUR:
			str = "维修工程师";
			break;
		}
		return str;
	}
	
	
}
