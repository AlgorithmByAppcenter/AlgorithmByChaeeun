import java.util.Scanner;

public class Main {
	static int testCase;
	static String test;
	static int result[];
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		testCase = Integer.parseInt(scanner.nextLine());
		result = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			test = scanner.nextLine().trim();
			result[i] = calPS(test);
		}
		for(int i=0; i<testCase; i++) {
			if(result[i] != 0) {
				System.out.println("NO");	
			}else {
				System.out.println("YES");
			}
		}
		
	}
	public static int calPS(String test) {
		int result = 0;
		char[] charArray = test.toCharArray();
		for(int i=0; i<charArray.length; i++){
			if(result < 0){
				return -1;
				
			}
			if(charArray[i] == '('){
				result = result + 1;
				continue;
			}
			if(charArray[i] == ')'){
				result = result - 1;
				continue;
			}
		}
		return result;
	}

}
