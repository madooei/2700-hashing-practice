package practice;

import java.util.List;

/** Runs the Group Anagrams scenarios against the canonical-form solution. */
public class GroupAnagramsCanonicalFormTest extends GroupAnagramsTest {

  @Override
  protected List<List<String>> groupAnagrams(String[] words) {
    return GroupAnagrams.groupAnagrams(words);
  }
}
