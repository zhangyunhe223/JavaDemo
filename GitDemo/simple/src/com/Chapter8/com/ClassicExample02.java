package com.Chapter8.com;

public class ClassicExample02 {
	/*
	 * �ڸ����ж���4���򣬼����Ӧ��getxxx()��setxxx()����
	 * �ĸ���ֱ�Ϊ��ѧ��id,ѧ������,ѧ���Ա�,ѧ���˻����
	 * id��name��male��account 
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
