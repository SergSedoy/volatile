package task1;

public class User extends Thread {

    public User (String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < Box.COUNT_TURN_ON; i++) {
            Box.tumbler = true;
            System.out.println(getName() + " включил тумблер " + Box.count + " раз");
            Box.count++;
            try {
                Thread.sleep(Box.PAUSE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
