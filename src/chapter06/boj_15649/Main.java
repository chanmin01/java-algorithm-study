package chapter06.boj_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int N, M;
    static boolean[] V;
    static int[] S;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = new boolean[N + 1];
        S = new int[M];

        backtracking(0);

    }

    private static void backtracking(int length) {
        if (length == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(S[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!V[i]) {
                V[i] = true;
                S[length] = i;
                backtracking(length + 1);
                V[i] = false;
            }
        }
    }
}
