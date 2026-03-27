package chapter03.mod;

public class Main {
    public static void main(String[] args) {
        long answer = 1;
        for (int i = 1; i <= 50; i++) {
            answer = (answer * i) % 10007;
        }
        System.out.println(answer % 10007);
    }
}
