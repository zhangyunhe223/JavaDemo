package com.Chapter8.com;

public class TestImage {

	public static void main(String[] args) {
		// ����ģ���û��Ĳ�����Ϊ����ѡ�����ṩͼƬ������
		System.out.println("�û�ѡ����GIF��ʽ");
		ImageSaver saver = TypeChooser.getSaver("GIF");
		saver.save();
		System.out.println("�û�ѡ����JPG��ʽ");
		saver = TypeChooser.getSaver("JPG");
		saver.save();
		System.out.println("�û�ѡ����PNG��ʽ");
		saver = TypeChooser.getSaver("PNG");
		saver.save();
	}
}
