import java.util.*;

interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No Division";
        }
    }
}

public class pr17 {
    public static void main(String[] args) {
        Result r = new Result();

        int mark = 55;
        double average = 65.5;

        System.out.println("Mark : " + mark);
        System.out.println("Passed : " + r.isPassed(mark));

        System.out.println("Average : " + average);
        System.out.println("Division : " + r.getDivision(average));
    }
}
