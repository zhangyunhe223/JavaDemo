package com.Chapter7.com;

public class CopyTransferProperty {
	
	static int i = 47;
	
	public void call() {
		for(i = 0;i < 3;i++) {
			System.out.print(i + " ");
			if (i==2) {
				System.out.println("\n");
			}
		}
	}

	public static void main(String[] args) {
		CopyTransferProperty t1 = new CopyTransferProperty();
		CopyTransferProperty t2 = new CopyTransferProperty();
		t2.i = 60;
		System.out.println(t1.i++);
		t1.call();
		System.out.println(t2.i);
		t2.call();
	}

}
