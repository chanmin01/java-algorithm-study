package chapter06.boj_1260;

import java.util.*;

public class Main {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Start = sc.nextInt();

        A = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            A[s].add(e);
            A[e].add(s);
        }


        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];
        DFS(Start);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(Start);
    }

    private static void DFS(int node) {
        if (visited[node]) {
            return;
        }

        System.out.print(node + " ");
        visited[node] = true;

        for (int i : A[node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        visited[node] = true;
        queue.add(node);

        while (!queue.isEmpty()) {
            int now_Node = queue.poll();
            System.out.print(now_Node + " ");
            for (int i : A[now_Node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

    }

}

