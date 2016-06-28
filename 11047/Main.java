import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] a= new int[10];
            int n;
            int k;
            
            n = scanner.nextInt();
            k = scanner.nextInt();
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int res = 0;
            for (int i = n - 1; i >= 0; i--) {
                res += k / a[i];
                k %= a[i];
            }
           System.out.println(res);
            
        }
        
    }