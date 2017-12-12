package com.Chapter6.com;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class ConvertMoney {
	/*
	 * ���⣺ 
	 * 1.��������12���ַ�֮����ʾ��������Ľ�����
	 * 2.ʹ��,�ֿ���ʾ 
	 * 3.������λС��������λֱ�Ӹɵ� 
	 * 4.�ж�������������������ָ�ʽ
	 */

	public static void main(String[] args) {
		// ������ʽ���ɴ�д
		System.out.println("(ע�⣺���ǧ��,����С��,ֻ����2λС�����Ƿ�)");
		System.out.println("������һ�����:");
		Scanner scanner = new Scanner(System.in);
		// double money = scanner.nextDouble();
		String string = scanner.nextLine();
		// �ж����������ַ����Ƿ������ָ�ʽ
		if (ConvertM.isNumeric(string)) {	
			
/*			String   s   =   "123.456 "; 		 // ʹ��Double����Float��parseDouble����parseFloat��������ת��
			double   d   =   Double.parseDouble(s); 
			float   f   =   Float.parseFloat(s);
			int i = Integer.parseInt([String]);  // [String]��ת�����ַ���
*/			
			double money = Double.parseDouble(string);
			NumberFormat nf = NumberFormat.getCurrencyInstance(); // ��ʽ�����,�����ѧ����
			String s1 = nf.format(money);
			if (s1.indexOf(".")!= -1) {
				String num = s1.substring(0, s1.indexOf("."));
				if(num.length() > 14) {
					System.out.println("��������Ľ�������Χ��");
					return;
				}
			}
			BigDecimal numberOfMoney = new BigDecimal(money);
			String s2 = ConvertM.convert(numberOfMoney); // ����convert��������õ����
			// ţ�˼��ɣ���Ϊ����ֱ�������ֹ����BigDecimal(89.595)��
			// �������ֱ�����ǲ��ܾ�ȷ��ʾ�ģ���Ȼ�����BigDecimal����Ҳ���ǲ���ȷ�ģ���������ֵ��ַ�����ʽ������ȷ��ʾ�ˣ�(89.595 + "")
			// 0.965 ������Ľ��Ϊ����0.965��   #--# [�������]	
			System.out.println("������Ľ��Ϊ��["+ (s1+"") +"]");    
			System.out.println("ת������Ľ��Ϊ��" + "[" + s2.toString() + "]");       //��ʾ���		

		} else {
			System.out.println(string + "�������ָ�ʽ��");
		}
	}
}
