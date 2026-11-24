package demo;

import java.util.Arrays;
import practice.TwoSumMap;

/** A demo of TwoSumMap on the example the notes trace. */
public final class TwoSumMapDemo {

  private TwoSumMapDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] nums = {8, 3, 13, 7};
    int target = 10;
    System.out.println("nums: " + Arrays.toString(nums) + ", target = " + target);

    // 3 and 7 add up to 10. They are at indices 1 and 3, so expect [1, 3].
    int[] pair = TwoSumMap.twoSum(nums, target);
    System.out.println("indices: " + Arrays.toString(pair));
  }
}
