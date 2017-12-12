package com.Chapter8.com;

public class TypeChooser {
	/*
	 * ��������û��ṩ��ͼƬ������ѡ����ʵ�ͼƬ�洢��ʽ
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
