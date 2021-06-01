package task2;

import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class Main {
    public static LongAdder stat = new LongAdder();
    
    public static void main(String[] args) throws InterruptedException {

        new User("первый поток").start();
        new User("второй поток").start();
        new User("третий поток").start();

        System.out.println("\nРезультат: " + stat.sum());
    }
}
