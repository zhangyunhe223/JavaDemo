package com.Chapter8.com;

public class GIFSaver implements ImageSaver {

	@Override
	public void save() {
		/*
		 *  该类实现了ImageSave接口
		 *  在实现save()方法时，将图片保存为GIF格式
		 */
		System.out.println("将图片保存为GIF格式！");
	}
}
