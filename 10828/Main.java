	package stack;
	
	import java.util.Scanner;
	
	public class Main {
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Stack stack = new Stack();
			int commandNumber = scanner.nextInt();
			String[] command;
			String c;
			for(int i=0; i<commandNumber; i++) {
				
				c = scanner.nextLine();
				command = c.split(" ");
				
				if(command[0].equals("pop")) {
					stack.pop();
					
				}else if (command[0].equals("push")) {
					int item = Integer.parseInt(command[1]);
					stack.push(item);
				}else if(command[0].equals("size")) {
					stack.size();
				}else if(command[0].equals("empty")){
					stack.empty();
				}else if(command[0].equals("top")) {
					stack.top();
				}
			}
					
				
		
			
		}
	
		
		static class Stack {
			private StackNode top;
			private int size = 0;
			
			class StackNode{
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
