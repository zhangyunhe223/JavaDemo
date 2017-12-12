package com.Chapter7.com;

public class Emperor {
	
	private static Emperor emperor = null; // 声明一个Emperor的引用
	
	private Emperor() {                    // 将构造方法私有
		
	}
	public static Emperor getInstance() {  // 实例化引用
		if (emperor == null) {
			emperor = new Emperor();
		}
		return emperor;
	}
	public void getName() {                // 使用普通方法输出
		System.out.println("我是唯一！");
	}
}
