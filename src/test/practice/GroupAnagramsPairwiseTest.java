package practice;

import java.util.List;

/** Runs the Group Anagrams scenarios against the pairwise solution. */
public class GroupAnagramsPairwiseTest extends GroupAnagramsTest {

  @Override
  protected List<List<String>> groupAnagrams(String[] words) {
    return GroupAnagrams.groupAnagramsPairwise(words);
  }
}
