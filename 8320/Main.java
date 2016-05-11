import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		countRectangleNumber(n);
	}
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
