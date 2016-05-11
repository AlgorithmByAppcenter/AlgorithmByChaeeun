package com.chaeeun.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();;
		int num = scanner.nextInt();
		char[] array = new char[100];
		
		for(int i=0; i<num ; i++) {
		
			String value = scanner.nextLine();
			array = value.toCharArray();
			
			for(int j=0; j<array.length; j++) {
				if(array[j] == '('){
					stack.push("(");
					
				}else if(array[j] == ')') {
					stack.pop();
				}
			}
			
			if(stack.empty()){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			stack.clear();
		}
	}
}

