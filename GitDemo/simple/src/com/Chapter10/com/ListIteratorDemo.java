package com.Chapter10.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// ����һ��ArrayList�������б������������Ϊinteger
		ArrayList<Integer> integers = new ArrayList<Integer>();
		// ʹ��Collections���еĹ��߷����򼯺�������Ԫ��
		Collections.addAll(integers, 1,2,3,4,5,6);
		System.out.println("�����е�Ԫ�أ�" + integers);
		
		// ʹ���޲εķ������ListIterator����
		ListIterator<Integer> iterator = integers.listIterator();
		// ���ڳ�ʼλ�ã��ж��Ƿ������һ��Ԫ��
		boolean hasNext = iterator.hasNext();
		System.out.println("�������Ƿ������һ��Ԫ�أ�" + hasNext);
		// ���ڳ�ʼλ�ã��ж��Ƿ������һ��Ԫ��
		boolean hasPrevious = iterator.hasPrevious();
		System.out.println("�������Ƿ������һ��Ԫ�أ�" + hasPrevious);
		
		Integer integer = iterator.next();
		System.out.println("��һ��Ԫ��Ϊ��" + integer);
		
		Integer integer2= iterator.nextIndex();
		System.out.println("��һ��Ԫ�ص�������" + integer2);
		
		Integer integer3 = iterator.previous();
		System.out.println("��һ��Ԫ��Ϊ��" + integer3);
		
		Integer integer4 = iterator.previousIndex();
		System.out.println("��һ��Ԫ�ص�������" + integer4);
		
		iterator.add(7);
		System.out.println("����Ԫ�غ�" + integers);
		
		iterator.next();
		iterator.set(17);
		System.out.println("��ȡ��һ��Ԫ�ز�����Ϊ17��" + integers);
		
		iterator.remove();
		System.out.println("����ú��Ԫ��ɾ����" + integers);
	}

}
