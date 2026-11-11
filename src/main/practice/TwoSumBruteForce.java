package practice;

/** Practice problem: find the pair that adds up to target by checking every pair. */
public final class TwoSumBruteForce {

  private TwoSumBruteForce() {
    // This class should not be instantiated!
  }

  // Assumes exactly one pair of different elements adds up to target.
  // Returns the indices of that pair, smaller index first.
  public static int[] twoSum(int[] nums, int target) {
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
