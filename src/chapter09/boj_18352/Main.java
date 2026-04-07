package chapter09.boj_18352;


import java.util.*;

public class Main {
    static int[] visited;
    static ArrayList<Integer>[] A;
    static ArrayList<Integer> answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            int st = sc.nextInt();
            int end = sc.nextInt();
            A[st].add(end);
        }

        visited = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            visited[i] = -1;
        }

        answer = new ArrayList<>();

        BFS(X);

        for (int i = 1; i <= N; i++) {
            if (visited[i] == K) {
                answer.add(i);
            }
        }

        Arrays.sort(answer.toArray());

        if (answer.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int i : answer) {
                System.out.println(i);
            }
        }


    }

    private static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(Node);
        visited[Node]++;
        while (!queue.isEmpty()) {
            int now_Node = queue.poll();
            for (int next_Node : A[now_Node]) {
                if (visited[next_Node] == -1) {
                    visited[next_Node] = visited[now_Node] + 1;
                    queue.add(next_Node);
                }
            }
        }
    }
}