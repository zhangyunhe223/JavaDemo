package com.Chapter6.com;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class ConvertMoney {
	/*
	 * 问题： 
	 * 1.整数大于12个字符之后，提示您所输入的金额过长
	 * 2.使用,分开显示 
	 * 3.保留两位小数，第三位直接干掉 
	 * 4.判断你所输入的数字是数字格式
	 */

	public static void main(String[] args) {
		// 将金额格式化成大写
		System.out.println("(注意：最大到千亿,如有小数,只保留2位小数即角分)");
		System.out.println("请输入一个金额:");
		Scanner scanner = new Scanner(System.in);
		// double money = scanner.nextDouble();
		String string = scanner.nextLine();
		// 判断你所输入字符串是否是数字格式
		if (ConvertM.isNumeric(string)) {	
			
/*			String   s   =   "123.456 "; 		 // 使用Double或者Float的parseDouble或者parseFloat方法进行转换
			double   d   =   Double.parseDouble(s); 
			float   f   =   Float.parseFloat(s);
			int i = Integer.parseInt([String]);  // [String]待转换的字符串
*/			
			double money = Double.parseDouble(string);
			NumberFormat nf = NumberFormat.getCurrencyInstance(); // 格式化金额,避免科学计数
			String s1 = nf.format(money);
			if (s1.indexOf(".")!= -1) {
				String num = s1.substring(0, s1.indexOf("."));
				if(num.length() > 14) {
					System.out.println("你所输入的金额，超过范围！");
					return;
				}
			}
			BigDecimal numberOfMoney = new BigDecimal(money);
			String s2 = ConvertM.convert(numberOfMoney); // 调用convert函数计算得到结果
			// 牛人技巧：因为你是直接用数字构造的BigDecimal(89.595)，
			// 但是数字本身就是不能精确表示的，当然构造的BigDecimal对象也就是不精确的，如果用数字的字符串形式就能正确表示了，(89.595 + "")
			// 0.965 你输入的金额为：【0.965】   #--# [玖角柒分]	
			System.out.println("你输入的金额为：["+ (s1+"") +"]");    
			System.out.println("转换过后的金额为：" + "[" + s2.toString() + "]");       //显示结果		

		} else {
			System.out.println(string + "不是数字格式！");
		}
	}
}
