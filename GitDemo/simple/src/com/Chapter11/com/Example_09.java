package com.Chapter11.com;

public class Example_09 {
	
	private static final double PI = 3.14;

	/**
	 * ����Բ�����
	 * ����뾶С��20�����׳��쳣
	 * @param args
	 * @throws Exception 
	 */
	public void computeArea(double r) throws Exception {
		if (r <= 20) {
			throw new Exception("�����쳣��" + "\n" + "�뾶Ϊ��" + r + " �뾶����С��20");
		} else {
			double circleArea = PI * r * r;
			System.out.println("�뾶��" + r + "�����Ϊ��" + circleArea);
		}
	}

	public static void main(String[] args) {
		// test
		Example_09 example_09 = new Example_09();
		try {
			example_09.computeArea(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}

}
