import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Stack<int[]> stack = new Stack<int[]>();
		int number = scanner.nextInt();
		int height;
		
		
		for(int i=1; i<=number; i++) {
			height = scanner.nextInt(); 
			
			while(!stack.isEmpty()) {
				
				if(stack.peek()[1]> height) {
					System.out.print(stack.peek()[0]+" ");
					break;
				}
				stack.pop();
			}
			
			if ( stack.isEmpty()) {
				System.out.print("0 ");
			}
			
			stack.push(makePair(i, height));
			
		}
		
	}
	
	public static int[] makePair(int i, int height) {
		int[] pair = {i,height};
		return pair;
	}
	
}
