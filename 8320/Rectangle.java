package com.chaeeun.algorithm;

public class Rectangle {

	public static void countRectangleNumber(int n) {
		int count = 0;
		for(int i=1 ; i<=n; i++) {
			for(int j=i; i*j<=n ; j++){
				count++;
			}
		}
		System.out.println(count);
	}
	
}

