package practice;

import java.util.HashMap;
import java.util.Map;

/** A demo of Point as a key in Java's HashMap, using a new but equal Point for each lookup. */
public final class PointDemo {

  private PointDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    Map<Point, String> labels = new HashMap<>();
    labels.put(new Point(3, 4), "start");

    System.out.println("Label: " + labels.get(new Point(3, 4)));              // start
    System.out.println("Has the key? " + labels.containsKey(new Point(3, 4))); // true

    labels.put(new Point(3, 4), "finish");
    System.out.println("Keys in the map: " + labels.size());                  // 1
  }
}
