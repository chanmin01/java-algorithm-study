package chapter03.multi_key_sort.comparator;

import chapter03.multi_key_sort.comparable.Score;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Score> {
    @Override
    public int compare(Score o1, Score o2) {
        if (o1.getMath() == o2.getMath()) return o2.getEnglish() - o1.getEnglish();
        return o2.getMath() - o1.getMath();
    }
}
