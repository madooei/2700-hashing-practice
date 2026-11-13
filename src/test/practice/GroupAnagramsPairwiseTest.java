package practice;

import list.List;

/** Runs the Group Anagrams scenarios against the pairwise solution. */
public class GroupAnagramsPairwiseTest extends GroupAnagramsTest {

  @Override
  protected List<List<String>> groupAnagrams(String[] words) {
    return GroupAnagramsPairwise.groupAnagrams(words);
  }
}
