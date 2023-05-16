package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int step = 1;
        if(multiplyByAndToInclusive < 0) step = -1;
        while(counter != multiplyByAndToInclusive) {
            System.out.println(counter * multiplyByAndToInclusive * step);
            counter += step;
        }
        if(multiplyByAndToInclusive != 0)
        System.out.println(multiplyByAndToInclusive * counter * step);
    }
}
