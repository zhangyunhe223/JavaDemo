package com.Chapter4.com;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// 通过switch多分支语句，为新员工分配部门
		
		/*
		 * 1.先获取一下研发部门的哈希编码：java、php、c#、c、
		 * 2.再通过switch多分支语句实现
		 */
		
/*		System.out.println("java".hashCode());
		System.out.println("php".hashCode());
		System.out.println("c#".hashCode());
		System.out.println("c".hashCode());*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入员工姓名:");
		String name = scanner.nextLine();
		System.out.println("请输入编程语言:");
		String language = scanner.nextLine();
		
		switch (language.hashCode()) {
		case 3254818:
			System.out.println("员工_" + name + ":被分配到了java程序开发部门");
			break;
		case 110968:
			System.out.println("员工_" + name + ":被分配到了php程序开发部门");
			break;
		case 3104:
			System.out.println("员工_" + name + ":被分配到了c#程序开发部门");
			break;
		case 99:
			System.out.println("员工_" + name + ":被分配到了c程序开发部门");
			break;
		default:
			System.out.println("本公司不需要" + language + "语言的程序开发人员");
			break;
		}
	}

}
