package chapter08.boj_1033;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<cNode>[] A;
    static long lcm;
    static boolean visited[];
    static long D[];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();

        A = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();
        }

        D = new long[N];
        visited = new boolean[N];

        lcm = 1;

        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            A[a].add(new cNode(b, p, q));
            A[b].add(new cNode(a, q, p));
            lcm *= (p * q) / gcd(p, q);
        }

        D[0] = lcm;
        DFS(0);
        long mgcd = D[0];
        for (int i = 1; i < N; i++) {
            mgcd = gcd(mgcd, D[i]);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(D[i] / mgcd + " ");
        }

    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static void DFS(int node) {
        visited[node] = true;
        for (cNode i : A[node]) {
            int next = i.getB();
            if (!visited[next]) {
                D[next] = D[node] * i.getQ() / i.getP();
                DFS(next);
            }
        }
    }
}

class cNode {
    private int b;
    private int p;
    private int q;

    cNode(int b, int p, int q) {
        this.b = b;
        this.p = p;
        this.q = q;
    }

    public int getB() {
        return b;
    }

    public int getP() {
        return p;
    }

    public int getQ() {
        return q;
    }
}






