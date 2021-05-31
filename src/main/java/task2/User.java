import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;


public class User extends Thread {
  int[] arr = IntStream.range(0, 5).toArray();
  
  public User (String name) {
    super(name);
  }

  @Override
  public void run() {
      for (int i = 0; i < arr.length; i++) {
        Main.stat.add(arr[i]);
      }
  }
}