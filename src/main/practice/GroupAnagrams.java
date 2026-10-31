package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import map.Map;
import map.TreeMap;

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

  // Assumes every word is a non-empty string of lowercase letters.
  // Returns the words grouped so that two words share a group exactly when
  // they are anagrams. The order of the groups, and of the words in a group,
  // is not specified.
  // Compares each word with the first word of every group made so far.
  public static List<List<String>> groupAnagramsPairwise(String[] words) {
    List<List<String>> groups = new ArrayList<>();

    for (String word : words) {
      boolean placed = false;
      for (List<String> group : groups) {
        if (areAnagrams(word, group.get(0))) {  // compare with the representative
          group.add(word);
          placed = true;
          break;
        }
      }
      if (!placed) {
        List<String> newGroup = new ArrayList<>();
        newGroup.add(word);
        groups.add(newGroup);
      }
    }

    return groups;
  }

  // Two words are anagrams exactly when their letters, sorted, are identical.
  private static boolean areAnagrams(String a, String b) {
    char[] ca = a.toCharArray();
    char[] cb = b.toCharArray();
    Arrays.sort(ca);
    Arrays.sort(cb);
    return Arrays.equals(ca, cb);
  }
}
