package com.Chapter7.com;

public class AnyThting {
	
	public AnyThting() {
		// 定义无参构造方法
		/*
		 * 并可以使用this调用有参数构造方法
		 * 但反之，在有参数的构造方法中不能使用this调用无参数构造方法
		 * 还有一点得注意，在无参构造方法中，只可以第一句使用this关键字调用构造方法
		 */
		this("this 调用有参构造方法");
		System.out.println("无参构造方法");
	}
	public AnyThting(String string) {
		// 定义有参构造方法
		System.out.println("有参构造方法");
	}

}
