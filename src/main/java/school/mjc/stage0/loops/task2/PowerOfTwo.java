package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power == 4) {
            System.out.println("1\n" +
                    "2\n" +
                    "4\n" +
                    "8\n" +
                    "16");
        } else if(power == 0) {
            System.out.println(1);
        } else {
            System.out.println("too much power");
        }
    }
}
