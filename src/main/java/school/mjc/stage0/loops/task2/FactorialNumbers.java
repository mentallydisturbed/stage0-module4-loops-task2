package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;

        while(counter <= printToInclusive) {
            int inner = 1;
            int result = 1;
            while(inner<= counter){
                result *= inner;
                inner++;
            }
            System.out.println(result);
            counter++;
        }
    }
}
