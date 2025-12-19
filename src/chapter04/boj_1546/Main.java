package chapter04.boj_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int max = -1;
        int sum = 0;
        double result = 0;

        for (int i = 0; i < N; i++) {
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }

        result = (sum * 100.0) / max / N;
        System.out.println(result);

    }
}
