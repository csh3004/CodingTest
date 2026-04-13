import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        boolean found = false;

        for (int len = L; len <= 100; len++) {
            int temp = N - (len * (len - 1) / 2);

            if (temp < 0) break;

            if (temp % len == 0) {
                int start = temp / len;

                if (start >= 0) {
                    for (int i = 0; i < len; i++) {
                        System.out.print((start + i) + " ");
                    }
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}