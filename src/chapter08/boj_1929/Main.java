package chapter08.boj_1929;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[] A = new int[N + 1];

        for (int i = 2; i <= N; i++) {
            A[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (A[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= N; j = j + i) {
                A[j] = 0;
            }
        }

        for (int i = M; i <= N; i++) {
            if (A[i] != 0) {
                System.out.println(A[i]);
            }
        }
    }
}

/**
 * M(시작 수) N(종료 수)
 * A(소수 배열)
 * for(N만큼 반복하기) {
 *     A 배열 초기화하기
 * }
 * for (N의 제곱근까지 반복하기) {
 *     소수가 아니면 넘어감
 *     for(소수의 배수 값을 N까지 반복하기) {
 *         이 수가 소수가 아니라는 것을 표시하기
 *     }
 * }
 * for(M~N까지 반복하기) {
 *     A 배열에서 소수인 값 출력하기
 * }
 */
