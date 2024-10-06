import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int N = sc.nextInt();  // 서쪽 사이트 (N)
            int M = sc.nextInt();  // 동쪽 사이트 (M)
            System.out.println(combi(M, N));  // 조합 계산 결과 출력
        }
        sc.close();
    }

    // 효율적인 조합 계산 방식 (팩토리얼을 사용하지 않음)
    private static long combi(int n, int k) {
        // C(n, k) = C(n, n - k) -> 더 작은 쪽을 선택해 계산 최적화
        if (k > n - k) {
            k = n - k;
        }

        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);  // 매 단계마다 나눗셈을 해 큰 수를 방지
        }

        return result;
    }
}