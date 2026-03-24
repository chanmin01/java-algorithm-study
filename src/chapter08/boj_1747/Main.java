package chapter08.boj_1747;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[10000001];
        for (int i = 2; i < A.length; i++) {
            A[i] = i;
        }

        for (int i = 2; i < Math.sqrt(A.length); i++) {
            if (A[i] == 0) {
                continue;
            }
            for (int j = i + i; j < A.length; j = j + i) {
                A[j] = 0;
            }
        }
        int i = N;
        while (true) {
            if (A[i] != 0) {
                int result = A[i];
                if (isPalindrome(result)) {
                    System.out.println(result);
                    break;
                }
            }
            i++;
        }
    }

    private static boolean isPalindrome(int target) {
        char[] nums = String.valueOf(target).toCharArray();
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            if (nums[s] != nums[e]) {
                return false;
            } else {
                s++;
                e--;
            }
        }
        return true;
    }
}