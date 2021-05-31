package task1;

public class Toy extends Thread {

    public Toy (String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (isInterrupted()) return;
            if (Box.tumbler) {
                Box.tumbler = false;
                System.out.println(getName() + " выключил тумблер");
            }
        }
    }
}
