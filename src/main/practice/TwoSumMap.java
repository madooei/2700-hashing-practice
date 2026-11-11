package practice;

import map.Map;
import map.TreeMap;

/** Practice problem: find the pair that adds up to target in one pass with a map. */
public final class TwoSumMap {

  private TwoSumMap() {
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
}
