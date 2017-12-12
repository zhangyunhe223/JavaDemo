package com.Chapter8.com;

public class ClassicExample02 {
	/*
	 * 在该类中定义4个域，及其对应的getxxx()和setxxx()方法
	 * 四个域分别为：学生id,学生姓名,学生性别,学生账户余额
	 * id、name、male、account 
	 */
	private int id;
	private String name;
	private boolean male;
	private double account; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
	
}
