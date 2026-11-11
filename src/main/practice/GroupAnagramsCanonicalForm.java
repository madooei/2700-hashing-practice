package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import map.Map;
import map.TreeMap;

/** Practice problem: group anagrams with a map keyed on each word's sorted letters. */
public final class GroupAnagramsCanonicalForm {

  private GroupAnagramsCanonicalForm() {
    // This class should not be instantiated!
  }

  // Assumes every word is a non-empty string of lowercase letters.
  // Returns the words grouped so that two words share a group exactly when
  // they are anagrams. The order of the groups, and of the words in a group,
  // is not specified.
  public static List<List<String>> groupAnagrams(String[] words) {
    Map<String, List<String>> groups = new TreeMap<>();

    for (String word : words) {
      char[] chars = word.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);        // the sorted-letter form, e.g. "aet"

      List<String> group = groups.get(key);
      if (group == null) {                   // first word with this key
        group = new ArrayList<>();
        groups.put(key, group);
      }
      group.add(word);
    }

    List<List<String>> result = new ArrayList<>();
    for (Map.Entry<String, List<String>> entry : groups.entries()) {
      result.add(entry.value());
    }
    return result;
  }
}
