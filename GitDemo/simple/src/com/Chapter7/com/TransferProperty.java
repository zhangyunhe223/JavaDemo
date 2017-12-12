package com.Chapter7.com;

public class TransferProperty {
	
	int i = 47;
	
	public void call() {
		for(i = 0;i < 3;i++) {
			System.out.print(i + " ");
			if (i==2) {
				System.out.println("\n");
			}
		}
	}

	public static void main(String[] args) {
		TransferProperty t1 = new TransferProperty();
		TransferProperty t2 = new TransferProperty();
		t2.i = 60;
		System.out.println(t1.i++);
		t1.call();
		System.out.println(t2.i);
		t2.call();
	}

}
