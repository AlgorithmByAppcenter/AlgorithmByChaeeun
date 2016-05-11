package com.chaeeun.algorithm;

import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int[] groupSequence = new int[1000];
		int sum=0;
		int cnt = -1;
		

		for (int i = 1; i <= 44; i++)
		{
		    for (int j = 0; j < i; j++)
		    {
		        cnt++;
		        groupSequence[cnt] = i;
		         
		    }
		}
		 
		for (int k = a; k <= b; k++)
		{
		    sum += groupSequence[k - 1];
		}
		
		System.out.println(sum);
	}
	
	

}

