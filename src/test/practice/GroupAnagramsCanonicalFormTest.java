package practice;

import list.List;

/** Runs the Group Anagrams scenarios against the canonical-form solution. */
public class GroupAnagramsCanonicalFormTest extends GroupAnagramsTest {

  @Override
  protected List<List<String>> groupAnagrams(String[] words) {
    return GroupAnagramsCanonicalForm.groupAnagrams(words);
  }
}
