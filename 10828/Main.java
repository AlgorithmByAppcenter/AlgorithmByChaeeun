    import java.util.Scanner;
	
	public class Main {
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Stack stack = new Stack();
			int commandNumber = scanner.nextInt();
			String command;
			for(int i=0; i<commandNumber; i++) {
				
				command = scanner.next();
                
				if(command.equals("pop")) {
					stack.pop();
					
				}else if (command.equals("push")) {
					int item = scanner.nextInt();
					stack.push(item);
				}else if(command.equals("size")) {
					stack.size();
				}else if(command.equals("empty")){
					stack.empty();
				}else if(command.equals("top")) {
					stack.top();
				}
			}
			
					
				
		
			
		}
	
		
		static class Stack {
			private StackNode top;
			private int size = 0;
			
			private class StackNode{
				int data;
				private StackNode link;
			}
			
			public void top() {
				if(top==null) {
					System.out.println(-1);
				}else {
					System.out.println(top.data);
				}
			}
	
			
			public void empty() {
				if (top == null){
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}
			
			
			public void push(int item) {
				StackNode node = new StackNode();
				node.data = item;
				node.link = top;
				top = node;
				size++;
			}
			
			public void pop() {
				if(top==null) {
					System.out.println(-1);
				} else {
					int item = top.data;
					top = top.link;
					System.out.println(item);
					size--;
				}
			}
			
			public void size() {
				System.out.println(size);
			}
			
			
			
		}
		
	}
