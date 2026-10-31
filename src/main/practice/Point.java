package practice;

import java.util.Objects;

/**
 * A grid coordinate with an x and a y. Two points are equal when both
 * coordinates match, and equal points have equal hash codes.
 */
public class Point {

  private final int x;
  private final int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Point other = (Point) o;
    return x == other.x && y == other.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
