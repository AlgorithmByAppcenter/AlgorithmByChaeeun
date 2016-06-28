import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int area = 0;
		int number = scanner.nextInt();
		int[] heights = new int[number];
		
		for(int i=0; i<number; i++) {
			heights[i] = scanner.nextInt(); 	
		}
		
	
		for (int i=0; i<number; i++) {
	        int left = i;
	        while(!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
	            int height = heights[stack.peek()];
	            stack.pop();
	            int width = i;
	            if (!stack.empty()) {
	                width = (i - stack.peek() - 1);
	            }
	            if (area < width*height) {
	                area = width*height;
	            }
	        }
	        stack.push(i);
	    }
		

	    while(!stack.empty()) {
	        int height = heights[stack.peek()];
	        stack.pop();
	        int width = number;
	        if (!stack.empty()) {
	            width = number-stack.peek()-1;
	        }
	        if (area < width*height) {
	            area = width*height;
	        }
	    }
		
		
		System.out.println(area);
	
		
		
	}
	
}
