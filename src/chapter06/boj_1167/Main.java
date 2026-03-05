package chapter06.boj_1167;


import java.util.*;

public class Main {
    static ArrayList<Edge>[] A;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        visited = new boolean[N + 1];
        distance = new int[N + 1];

        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            while(true) {
                int e = sc.nextInt();
                if (e == -1) {
                    break;
                }
                int v = sc.nextInt();
                A[s].add(new Edge(e, v));
            }
        }

        BFS(1);
        int Max = 1;
        for (int i = 2; i <= N; i++) {
            if (distance[Max] < distance[i]) {
                Max = i;
            }
        }

        visited = new boolean[N + 1];
        distance = new int[N + 1];
        BFS(Max);
        Arrays.sort(distance);
        System.out.println(distance[N]);


    }

    static private void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();

        visited[node] = true;
        queue.add(node);

        while (!queue.isEmpty()) {
            int now_node = queue.poll();
            for (Edge edge : A[now_node]) {
                if (!visited[edge.e]) {
                    visited[edge.e] = true;
                    queue.add(edge.e);
                    distance[edge.e] = distance[now_node] + edge.value;
                }
            }
        }

    }
}

class Edge {
    int e;
    int value;

    protected Edge(int e, int value) {
        this.e = e;
        this.value = value;
    }
}

