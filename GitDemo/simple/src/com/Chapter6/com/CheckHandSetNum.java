package com.Chapter6.com;

import java.util.Scanner;

public class CheckHandSetNum {
	
	/**
     * 中国移动：China Mobile
     * 134,135,136,137,138,139,147,150,151,152,157,158,159,170,178,182,183,184,187,188
     * ^1(3[4-9]|4[7]|5[0-27-9]|7[08]|8[2-478])\\d{8}$
     */
	static String YD = "^1(3[4-9]|4[7]|5[0-27-9]|7[08]|8[2-478])\\d{8}$";
	/**
     * 中国联通：China Unicom
     * 130,131,132,145,155,156,170,171,175,176,185,186
     * ^1(3[0-2]|4[5]|5[56]|7[0156]|8[56])\\d{8}$
     */
	static String LT = "^1(3[0-2]|4[5]|5[56]|7[0156]|8[56])\\d{8}$";
	/**
     * 中国电信：China Telecom
     * 133,149,153,170,173,177,180,181,189
     * ^1(3[3]|4[9]|53|7[037]|8[019])\\d{8}$
     */
	static String DX = "^1(3[3]|4[9]|53|7[037]|8[019])\\d{8}$";
	/**
	 * 座机：
	 * ^(?:\\(\\d{3,4}\\)|\\d{3,4}-)?\\d{7,8}(?:-\\d{1,4})?$
	 */
	static String ZJ = "^(?:\\(\\d{3,4}\\)|\\d{3,4}-)?\\d{7,8}(?:-\\d{1,4})?$";
	
	/**
	 * 判断传入的参数号码为哪家运营商
	 * 
	 * @param mobile
	 * @return 运营商名称
	 */
	public static String validateMobile(String mobile) {
		/**
		 * 使用正则表达式对手机号码的合法性进行验证
		 * 并判断该手机号的运营商
		 */
		String returnString = "";
		if (mobile == null || mobile.trim().length() != 11) {
			System.out.println("手机号码格式错误！");
		}else {
			if(mobile.matches(YD)) {
				System.out.println("该手机号为移动：" + mobile);
			}else if (mobile.matches(LT)) {
				System.out.println("该手机号为联通：" + mobile);
			}else if (mobile.matches(DX)) {
				System.out.println("该手机号为电信：" + mobile);
			}else if (mobile.matches(ZJ)){
				System.out.println("该手机为座机:" + mobile);
			}else {
				System.out.println("未知手机运营商：" + mobile);
			}
		}
		return returnString;
	}

	public static void main(String[] args) {
		System.out.println("请输入正确的手机号码：");
		Scanner scanner = new Scanner(System.in);
		String mobile = scanner.next();
		validateMobile(mobile);
	}

}
