package chapter04.boj_1546.boj_1546_2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        long Mx = Arrays.stream(num).max().getAsInt();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += num[i];
        }

        double result = (double) sum / Mx * 100 / N;
        System.out.println(result);

    }
}
