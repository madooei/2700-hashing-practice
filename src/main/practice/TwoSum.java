package practice;

import map.Map;
import map.TreeMap;

/** Solutions to the Two Sum practice problem for an unsorted array. */
public final class TwoSum {

  private TwoSum() {
    // This class should not be instantiated!
  }

  // Assumes exactly one pair of different elements adds up to target.
  // Returns the indices of that pair, smaller index first.
  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> seen = new TreeMap<>();  // value -> index

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (seen.containsKey(complement)) {
        return new int[]{seen.get(complement), i};
      }
      seen.put(nums[i], i);
    }

    return new int[0];  // unreachable: the problem guarantees a solution
  }

  // Assumes exactly one pair of different elements adds up to target.
  // Returns the indices of that pair, smaller index first.
  public static int[] twoSumBruteForce(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};  // found the pair
        }
      }
    }
    return new int[0];  // unreachable: the problem guarantees a solution
  }
}
