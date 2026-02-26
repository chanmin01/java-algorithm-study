package chapter06.boj_9663;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] A;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        cnt = 0;

        backtracking(0);
        System.out.println(cnt);

    }

    public static void backtracking(int row) {
        if (row == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            A[row] = i;
            if (check(row)) {
                backtracking(row + 1);
            }
        }
    }

    private static boolean check(int row) {
        for (int i = 0; i < row; i++) {
            if (A[i] == A[row]) {
                return false;
            }
            if (Math.abs(i - row) == Math.abs(A[i] - A[row])) {
                return false;
            }
        }
        return true;
    }
}
