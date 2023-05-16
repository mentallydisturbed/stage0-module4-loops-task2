package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 0;

        while(counter <= printToInclusive) {
            boolean isPrime = counter > 1;
            int inner = 2;
            while(inner * inner <= counter){
                if(counter % inner == 0) isPrime = false;
                inner++;
            }
            if(isPrime) System.out.println(counter);
            counter++;
        }
    }
}
