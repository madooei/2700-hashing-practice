package practice;

/** Runs the Two Sum scenarios against the one-pass map solution. */
public class TwoSumMapTest extends TwoSumTest {

  @Override
  protected int[] twoSum(int[] nums, int target) {
    return TwoSum.twoSum(nums, target);
  }
}
