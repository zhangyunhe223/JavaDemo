package com.Chapter5.com;

public class InsertionSort {
	 
    public static void insertionSort(int[] a) {
        int tmp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0;i < a.length;i++) {
			System.out.print(a[i] + " ");
        }
    }
 
    public static void main(String[] args) {
    	int a[] = { 8,1,5,9,2,45,2,5,0};
		insertionSort(a);
	}
}
