package com.Chapter6.com;

import java.util.Scanner;

public class CheckHandSetNum {
	
	/**
     * �й��ƶ���China Mobile
     * 134,135,136,137,138,139,147,150,151,152,157,158,159,170,178,182,183,184,187,188
     * ^1(3[4-9]|4[7]|5[0-27-9]|7[08]|8[2-478])\\d{8}$
     */
	static String YD = "^1(3[4-9]|4[7]|5[0-27-9]|7[08]|8[2-478])\\d{8}$";
	/**
     * �й���ͨ��China Unicom
     * 130,131,132,145,155,156,170,171,175,176,185,186
     * ^1(3[0-2]|4[5]|5[56]|7[0156]|8[56])\\d{8}$
     */
	static String LT = "^1(3[0-2]|4[5]|5[56]|7[0156]|8[56])\\d{8}$";
	/**
     * �й����ţ�China Telecom
     * 133,149,153,170,173,177,180,181,189
     * ^1(3[3]|4[9]|53|7[037]|8[019])\\d{8}$
     */
	static String DX = "^1(3[3]|4[9]|53|7[037]|8[019])\\d{8}$";
	/**
	 * ������
	 * ^(?:\\(\\d{3,4}\\)|\\d{3,4}-)?\\d{7,8}(?:-\\d{1,4})?$
	 */
	static String ZJ = "^(?:\\(\\d{3,4}\\)|\\d{3,4}-)?\\d{7,8}(?:-\\d{1,4})?$";
	
	/**
	 * �жϴ���Ĳ�������Ϊ�ļ���Ӫ��
	 * 
	 * @param mobile
	 * @return ��Ӫ������
	 */
	public static String validateMobile(String mobile) {
		/**
		 * ʹ��������ʽ���ֻ�����ĺϷ��Խ�����֤
		 * ���жϸ��ֻ��ŵ���Ӫ��
		 */
		String returnString = "";
		if (mobile == null || mobile.trim().length() != 11) {
			System.out.println("�ֻ������ʽ����");
		}else {
			if(mobile.matches(YD)) {
				System.out.println("���ֻ���Ϊ�ƶ���" + mobile);
			}else if (mobile.matches(LT)) {
				System.out.println("���ֻ���Ϊ��ͨ��" + mobile);
			}else if (mobile.matches(DX)) {
				System.out.println("���ֻ���Ϊ���ţ�" + mobile);
			}else if (mobile.matches(ZJ)){
				System.out.println("���ֻ�Ϊ����:" + mobile);
			}else {
				System.out.println("δ֪�ֻ���Ӫ�̣�" + mobile);
			}
		}
		return returnString;
	}

	public static void main(String[] args) {
		System.out.println("��������ȷ���ֻ����룺");
		Scanner scanner = new Scanner(System.in);
		String mobile = scanner.next();
		validateMobile(mobile);
	}

}
