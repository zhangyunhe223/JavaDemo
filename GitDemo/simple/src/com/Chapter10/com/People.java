package com.Chapter10.com;

public class People {
	/*
	 * �������HashaSet�е�ȫ��Ԫ��
	 */
	private String name;
	private long id_card;
	
	public People(String name,long id_card) {
		this.name = name;
		this.id_card = id_card;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId_card() {
		return id_card;
	}
	public void setId_card(long id_card) {
		this.id_card = id_card;
	}
	
/*	@Override
	public String toString() {
		return "People [name=" + name + ", id_card=" + id_card + "]";
	}*/
}
