package com.Jmeter.com;

public class MoreThread {
	public static void main(String[] args) {
		/*
		 * ∂‡œﬂ≥Ã
		 */
		new Thread(new Runnable() {

			@Override
			public void run() {

				// xxoo
				for (int i = 0; i < 1000; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("1");
				}
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("2");
				}
				// xxoo
			}
		}).start();
	}

}
