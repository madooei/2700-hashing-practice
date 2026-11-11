package practice;

/** Runs the Two Sum scenarios against the brute-force solution. */
public class TwoSumBruteForceTest extends TwoSumTest {

  @Override
  protected int[] twoSum(int[] nums, int target) {
    return TwoSumBruteForce.twoSum(nums, target);
  }
}
