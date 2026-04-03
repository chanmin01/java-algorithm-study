package chapter03.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Edge> list[] = new ArrayList[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list[i] = new ArrayList<Edge>();
        }

        int E = 4;
        for (int i = 0; i < E; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[s].add(new Edge(e, v));
        }

        for (int i = 0; i < list[1].size(); i++) {
            Edge tmp = list[1].get(i);
            int next = tmp.endNode;
            int value = tmp.value;
        }

    }
}

class Edge {
    int endNode;
    int value;

    public Edge(int endNode, int value) {
        this.endNode = endNode;
        this.value = value;
    }
}
