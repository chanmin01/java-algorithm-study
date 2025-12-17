package chapter03.multi_key_sort.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Score> myarr = new ArrayList<>();
        myarr.add(new Score(80, 100));
        myarr.add(new Score(100, 50));
        myarr.add(new Score(70, 100));
        myarr.add(new Score(80, 90));

        Collections.sort(myarr);
        for (Score s : myarr) {
            System.out.println(s.toString());
        }
    }
}
