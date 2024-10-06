import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int N = sc.nextInt();  
            int M = sc.nextInt();  
            System.out.println(combi(M, N));  
        }
        sc.close();
    }

    private static long combi(int n, int k) {
        if (k > n - k) {
            k = n - k;
        }

        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);  
        }

        return result;
    }
}