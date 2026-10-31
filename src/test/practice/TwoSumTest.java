package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the Two Sum problem on an unsorted array. Each test is one
 * scenario from the notes. The scenarios are written once here; each solution
 * gets its own subclass that says which method to call, so you can run the
 * suite for one solution at a time.
 */
public abstract class TwoSumTest {

  // Calls the solution under test.
  protected abstract int[] twoSum(int[] nums, int target);

  @Test
  public void pairInTheMiddleAndAtTheEnd() {
    int[] nums = {8, 3, 13, 7};
    assertPair(1, 3, twoSum(nums, 10));
  }

  @Test
  public void pairWithANegativeNumber() {
    int[] nums = {5, -2, 4};
    assertPair(1, 2, twoSum(nums, 2));
  }

  @Test
  public void twoElements() {
    int[] nums = {4, 6};
    assertPair(0, 1, twoSum(nums, 10));
  }

  @Test
  public void twoEqualValues() {
    int[] nums = {3, 5, 3};
    assertPair(0, 2, twoSum(nums, 6));
  }

  @Test
  public void anElementIsNotPairedWithItself() {
    int[] nums = {5, 1, 5};
    assertPair(0, 2, twoSum(nums, 10));
  }

  @Test
  public void pairAtTheFront() {
    int[] nums = {2, 7, 11, 15};
    assertPair(0, 1, twoSum(nums, 9));
  }

  @Test
  public void zeroTarget() {
    int[] nums = {4, 0, -4, 9};
    assertPair(0, 2, twoSum(nums, 0));
  }

  // Asserts that actual is a two-element array holding the expected indices.
  private static void assertPair(int expectedFirst, int expectedSecond, int[] actual) {
    assertEquals(2, actual.length);
    assertEquals(expectedFirst, actual[0]);
    assertEquals(expectedSecond, actual[1]);
  }
}
