package chapter06.boj_1300;

import java.util.Scanner;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int start = 1;
        int end = K;
        int ans = 0;

        while (start <= end) {
            int middle = (start + end) / 2;
            int cnt = 0;
            for (int i = 1; i <= N; i++) {
                cnt += min(middle / i, N);
            }

            if (cnt < K) {
                start = middle + 1;
            } else {
                ans = middle;
                end = middle - 1;
            }
        }

        System.out.println(ans);
    }
}