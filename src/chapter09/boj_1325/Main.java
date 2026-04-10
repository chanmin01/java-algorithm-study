package chapter09.boj_1325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static int[] answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        answer = new int[N + 1];
        A = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
        }

        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            BFS(i);
        }

        int maxVal = Arrays.stream(answer).max().getAsInt();
        for (int i = 1; i <= N; i++) {
            if (answer[i] == maxVal) {
                System.out.print(i + " ");
            }
        }



    }

    private static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<>();
        visited[Node] = true;
        queue.add(Node);
        while (!queue.isEmpty()) {
            int now_Node = queue.poll();
            for (int next : A[now_Node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    answer[next]++;
                    queue.add(next);
                }
            }
        }

    }
}

