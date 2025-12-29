package chapter04.boj_17298;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] answer = new int[N];
        Stack<Integer> myStack = new Stack<>();


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        myStack.push(0);
        for (int i = 1; i < N; i++) {
            while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
                int index = myStack.pop();
                answer[index] = A[i];
            }
            myStack.push(i);
        }

        while (!myStack.isEmpty()) {
            answer[myStack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < N; i++) {
            bw.write(answer[i] + " ");
        }
        bw.flush();
        bw.close();

    }
}
