package chapter04.boj_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String sNum = br.readLine();
        int sum = 0;

        char[] cNum = sNum.toCharArray();

        for (char num : cNum) {
            sum += num - '0';
        }

        System.out.println(sum);

    }
}
