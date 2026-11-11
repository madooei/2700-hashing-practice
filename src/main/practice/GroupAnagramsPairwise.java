package practice;

import java.util.List;

/** Practice problem: group anagrams by comparing each word with the first word of every group. */
public final class GroupAnagramsPairwise {

  private GroupAnagramsPairwise() {
    // This class should not be instantiated!
  }

  // Assumes every word is a non-empty string of lowercase letters.
  // Returns the words grouped so that two words share a group exactly when
  // they are anagrams. The order of the groups, and of the words in a group,
  // is not specified.
  public static List<List<String>> groupAnagrams(String[] words) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Two words are anagrams exactly when their letters, sorted, are identical.
  private static boolean areAnagrams(String a, String b) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
