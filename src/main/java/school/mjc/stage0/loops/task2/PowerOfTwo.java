package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;

        if(power < 0) {
            System.out.println("too much power");
        }else {
            int res = 1;
            while(counter <= power) {
                System.out.println(res);
                res *= 2;
                counter++;
            }
        }
    }
}
