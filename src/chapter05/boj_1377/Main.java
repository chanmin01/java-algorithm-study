package chapter05.boj_1377;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            A[i] = new mData(num, i);
        }

        Arrays.sort(A);

        int Max = 0;
        for (int i = 0; i < N; i++) {
            Max = Math.max(Max, A[i].index - i);
        }

        Max += 1;
        System.out.println(Max);

    }
}

class mData implements Comparable<mData> {
    int value;
    int index;

    mData(int value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}
