package practice;

import java.util.List;

/** Solutions to the Group Anagrams practice problem. */
public final class GroupAnagrams {

  private GroupAnagrams() {
    // This class should not be instantiated!
  }

  // Assumes every word is a non-empty string of lowercase letters.
  // Returns the words grouped so that two words share a group exactly when
  // they are anagrams. The order of the groups, and of the words in a group,
  // is not specified.
  // Keys a map on each word's sorted letters, its canonical form.
  public static List<List<String>> groupAnagrams(String[] words) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes every word is a non-empty string of lowercase letters.
  // Returns the words grouped so that two words share a group exactly when
  // they are anagrams. The order of the groups, and of the words in a group,
  // is not specified.
  // Compares each word with the first word of every group made so far.
  public static List<List<String>> groupAnagramsPairwise(String[] words) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Two words are anagrams exactly when their letters, sorted, are identical.
  private static boolean areAnagrams(String a, String b) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
