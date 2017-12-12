package com.Chapter8.com;

public class TypeChooser {
	/*
	 * 该类根据用户提供的图片类型来选择合适的图片存储方式
	 */
	public static ImageSaver getSaver(String type) {
		if (type.equals("GIF")) {
			return new GIFSaver();
		}else if (type.equals("JPG")) {
			return new JPGSaver();
		}else if (type.equals("PNG")) {
			return new PNGSaver();
		}else {			
			return null;
		}
	}
}
