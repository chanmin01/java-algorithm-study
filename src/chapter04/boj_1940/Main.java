package chapter04.boj_1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        int[] nums = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        int i = 0;
        int j = N - 1;
        int count = 0;

        while (i < j) {
            if (nums[i] + nums[j] == M) {
                count++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < M) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(count);

    }
}
