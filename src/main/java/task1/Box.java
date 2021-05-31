package task1;

public class Box extends Thread {
    public static volatile boolean tumbler = false;
    final static int COUNT_TURN_ON = 5;
    final static long PAUSE = 1500;
    public static int count = 1;

    User user = new User("Пользователь");
    Toy toy = new Toy("игрушка");

    public void run() {
        user.start();
        toy.start();

        user.join();
        toy.interrupt();
    }
}
