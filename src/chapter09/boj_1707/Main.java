package chapter09.boj_1707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer>[] A;
    static int[] check;
    static int N;
    static boolean[] visited;
    static boolean isEven;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] S = br.readLine().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            A = new ArrayList[V + 1];
            for (int j = 0; j <= V; j++) {
                A[j] = new ArrayList<>();
            }
            check = new int[V + 1];
            visited = new boolean[V + 1];
            isEven = true;
            for (int k = 0; k < E; k++) {
                S = br.readLine().split(" ");
                int st = Integer.parseInt(S[0]);
                int ed = Integer.parseInt(S[1]);
                A[st].add(ed);
                A[ed].add(st);
            }
            for (int m = 1; m <= V; m++) {
                if (isEven) {
                    DFS(m);
                } else {
                    break;
                }
            }
            if (isEven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static void DFS(int node) {
        visited[node] = true;
        for (int next : A[node]) {
            if (!visited[next]) {
                check[next] = (check[node] + 1) % 2;
                DFS(next);
            } else {
                if (check[next] == check[node]) {
                    isEven = false;
                }
            }
        }
    }

}
