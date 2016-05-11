
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> answer = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();
		int num = scanner.nextInt();
		char[] array = new char[100];
		
		for(int i=0; i<num ; i++) {
			String value = scanner.nextLine();
			list.add(value);
		}
		for(int i=0; i<list.size() ; i++ ) {
			array = (list.get(i)).toCharArray();

			for(int j=0; j<array.length; j++) {
				if(array[j] == '('){
					stack.push("(");
					
				}else if(array[j] == ')') {
					stack.pop();
				}
			}
			
			if(stack.empty()){
				answer.add("YES");
			}else {
				answer.add("NO");
			}
			
		}
		for(int i=0; i<answer.size(); i++) {

			System.out.println(answer.get(i));
		}

	}
							
	
}

