package chapter04.boj_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] arr = str.toCharArray();
        long result = 0;
        for (char c : arr) {
            result += c - '0';
        }
        System.out.println(result);
    }
}

