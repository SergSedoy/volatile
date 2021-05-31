package task2;

import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class Main {
    public static LongAdder stat = new LongAdder();
    
    public static void main(String[] args) throws InterruptedException {

        User th1 = new User("первый поток");
        User th2 = new User("второй поток");
        User th3 = new User("третий поток");

        th1.start();
        th2.start();
        th3.start();

        th1.join();
        th2.join();
        th3.join();

        System.out.println("\nРезультат: " + stat.sum());
    }
}
