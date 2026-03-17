package chapter07.boj_1541;


import java.util.Scanner;

public class Main {
    static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] fg = input.split("-");
        for (int i = 0; i < fg.length; i++) {
            if (i == 0) {
                answer += mySum(fg[i]);
            } else {
                answer -= mySum(fg[i]);
            }
        }
        System.out.println(answer);
    }

    private static int mySum(String s) {
        String[] temp = s.split("[+]");
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}

