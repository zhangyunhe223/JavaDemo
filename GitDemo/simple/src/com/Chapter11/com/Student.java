package com.Chapter11.com;

public class Student {
	/**
	 * ʵս��ϰ1��
	 * ��дһ��speak(int m)����
	 * @param args
	 */
	public void speak(int m) throws MyException{
		if (m > 1000) {
			throw new MyException(m);
		} else {
			System.out.println("speak:" + m);
		}
	}
	public static void main(String[] args) {
		// test
		Student student = new Student();
		try {
			student.speak(200);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
