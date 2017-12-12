package com.Chapter9.com;

public class OutString {

	public static void main(String[] args) {
		
		final String sourceStr = " zhang yunhe student apple  0123";
		// 编写匿名内部类
		IStringDeal s = new IStringDeal() {
			
			@Override
			public String filterBankChar() {
				// 过滤字符串中空格的方法
				String convertStr = sourceStr;
				// 替换全部空格
				convertStr = convertStr.replace(" ", "");
				// 返回转换后的字符串
				return convertStr;
			}
		};
		System.out.println("原来的字符：" + sourceStr);
		System.out.println("替换之后的字符串：" + s.filterBankChar());
	}

}
