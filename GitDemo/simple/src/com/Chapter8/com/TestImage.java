package com.Chapter8.com;

public class TestImage {

	public static void main(String[] args) {
		// 该类模拟用户的操作，为类型选择器提供图片的类型
		System.out.println("用户选择了GIF格式");
		ImageSaver saver = TypeChooser.getSaver("GIF");
		saver.save();
		System.out.println("用户选择了JPG格式");
		saver = TypeChooser.getSaver("JPG");
		saver.save();
		System.out.println("用户选择了PNG格式");
		saver = TypeChooser.getSaver("PNG");
		saver.save();
	}
}
