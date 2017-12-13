package com.Chapter11.com;

public class ThrowException {
	/**
	 * 范例3：
	 * 方法上抛出异常
	 * 实现一个类使用了其他类还未完成实现的方法
	 * 则可以在实现其他类方法时让其抛出
	 * @param args
	 */
	public static void throwException() {
		throw new UnsupportedOperationException("该方法未实现！");
	}

	public static void main(String[] args) {
		// test
		ThrowException.throwException();
	}

}
