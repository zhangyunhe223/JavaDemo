package com.Chapter10.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// 创建一个ArrayList对象，其中保存的数据类型为integer
		ArrayList<Integer> integers = new ArrayList<Integer>();
		// 使用Collections类中的工具方法向集合中增加元素
		Collections.addAll(integers, 1,2,3,4,5,6);
		System.out.println("集合中的元素：" + integers);
		
		// 使用无参的方法获得ListIterator对象
		ListIterator<Integer> iterator = integers.listIterator();
		// 对于初始位置，判断是否具有下一个元素
		boolean hasNext = iterator.hasNext();
		System.out.println("集合中是否具有下一个元素：" + hasNext);
		// 对于初始位置，判断是否具有上一个元素
		boolean hasPrevious = iterator.hasPrevious();
		System.out.println("集合中是否具有上一个元素：" + hasPrevious);
		
		Integer integer = iterator.next();
		System.out.println("下一个元素为：" + integer);
		
		Integer integer2= iterator.nextIndex();
		System.out.println("下一个元素的索引：" + integer2);
		
		Integer integer3 = iterator.previous();
		System.out.println("上一个元素为：" + integer3);
		
		Integer integer4 = iterator.previousIndex();
		System.out.println("上一个元素的索引：" + integer4);
		
		iterator.add(7);
		System.out.println("增加元素后：" + integers);
		
		iterator.next();
		iterator.set(17);
		System.out.println("获取下一个元素并设置为17：" + integers);
		
		iterator.remove();
		System.out.println("将获得后的元素删除后：" + integers);
	}

}
