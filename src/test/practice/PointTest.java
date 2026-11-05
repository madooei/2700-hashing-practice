package practice;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for Point, the practice problem "A Broken hashCode". The map tests use
 * Java's own HashMap, because the bug only shows up in a map that hashes its
 * keys. The course TreeMap compares keys instead, and Point is not Comparable.
 */
public class PointTest {

  @Test
  public void equalsIsTrueForSameCoordinates() {
    assertTrue(new Point(3, 4).equals(new Point(3, 4)));
  }

  @Test
  public void equalsIsFalseWhenOnlyXDiffers() {
    assertFalse(new Point(3, 4).equals(new Point(5, 4)));
  }

  @Test
  public void equalsIsFalseWhenOnlyYDiffers() {
    assertFalse(new Point(3, 4).equals(new Point(3, 5)));
  }

  @Test
  public void equalsIsFalseForNull() {
    assertFalse(new Point(3, 4).equals(null));
  }

  @Test
  public void equalsIsFalseForAnotherClass() {
    assertFalse(new Point(3, 4).equals("(3, 4)"));
  }

  @Test
  public void equalPointsShareHashCode() {
    assertEquals(new Point(3, 4).hashCode(), new Point(3, 4).hashCode());
  }

  @Test
  public void hashCodeIsComputedFromX() {
    assertNotEquals(new Point(3, 4).hashCode(), new Point(5, 4).hashCode());
  }

  @Test
  public void hashCodeIsComputedFromY() {
    assertNotEquals(new Point(3, 4).hashCode(), new Point(3, 5).hashCode());
  }

  @Test
  public void putThenGetRoundTrips() {
    Map<Point, String> labels = new HashMap<>();
    labels.put(new Point(3, 4), "start");
    assertEquals("start", labels.get(new Point(3, 4)));
  }

  @Test
  public void containsKeyIsTrueForAnEqualKey() {
    Map<Point, String> labels = new HashMap<>();
    labels.put(new Point(3, 4), "start");
    assertTrue(labels.containsKey(new Point(3, 4)));
  }

  @Test
  public void duplicatePutKeepsSizeOne() {
    Map<Point, String> labels = new HashMap<>();
    labels.put(new Point(3, 4), "start");
    labels.put(new Point(3, 4), "finish");
    assertEquals(1, labels.size());
  }
}
