package chapter03.multi_key_sort.comparable;

public class Score implements Comparable<Score>{
    private int english;
    private int math;

    public Score(int english, int math) {
        this.english = english;
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "Score{" + "english=" + english + ", math=" + math + "}";
    }

    @Override
    public int compareTo(Score o) {
        if (this.english == o.english) return o.math - this.math;
        return o.english - this.english;
    }
}
