package com.Chapter11.com;

public class Exception_01 {
	/**
	 * �ڸ����м���һ�������ڵ���
	 * @param args
	 */
	private int num = 10;

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public Exception_01() {
		try {
			Class.forName("com.Chapter11.Test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����");
	}

	public static void main(String[] args) {
		Exception_01 exception_01 = new Exception_01();
		exception_01.setNum(888);
		System.out.println(exception_01.getNum());
	}

}
