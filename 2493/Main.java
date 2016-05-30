package top;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<HashMap<Integer, Integer>> stack = new Stack<HashMap<Integer, Integer>>();
		
		int commandNumber = scanner.nextInt();
		String buildingNumber = scanner.nextLine();
		String[] buildings = buildingNumber.split(" ");
			for(int i=0; i<commandNumber; i++) {
				int building= Integer.parseInt(buildings[i]);
				HashMap map = new HashMap<Integer ,Integer>();
				map.put(i++, building);
				stack.push(map);
		}
			
			while(!stack.isEmpty()) {
				HashMap map2 = stack.peek();
				if()
			}
		
			if(stack.isEmpty()) {
				System.out.print("0 ");
			}	

	
	
}
