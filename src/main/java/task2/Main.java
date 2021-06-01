package task2;

import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static LongAdder stat = new LongAdder();
    
    public static void main(String[] args) throws InterruptedException {

        new User("первый поток").start();
        new User("второй поток").start();
        new User("третий поток").start();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("\nРезультат: " + stat.sum());
    }
}
