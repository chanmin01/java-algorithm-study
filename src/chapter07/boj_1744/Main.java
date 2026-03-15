package chapter07.boj_1744;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> pqPlus = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqMinus = new PriorityQueue<>();
        int zero = 0;
        int one = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num > 1) {
                pqPlus.add(num);
            } else if (num == 1) {
                one++;
            } else if (num == 0) {
                zero++;
            } else {
                pqMinus.add(num);
            }
        }

        while (pqPlus.size() > 1) {
            int first = pqPlus.remove();
            int second = pqPlus.remove();
            sum += first * second;
        }

        if (!pqPlus.isEmpty()) {
            sum += pqPlus.remove();
        }

        while (pqMinus.size() > 1) {
            int first = pqMinus.remove();
            int second = pqMinus.remove();
            sum += first * second;
        }

        if (!pqMinus.isEmpty()) {
            if (zero == 0) {
                sum += pqMinus.remove();
            }
        }

        sum += one;
        System.out.println(sum);
    }

}

