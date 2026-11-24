package demo;

import java.util.Arrays;
import list.List;
import practice.GroupAnagramsPairwise;

/** A demo of GroupAnagramsPairwise on the example the notes trace. */
public final class GroupAnagramsPairwiseDemo {

  private GroupAnagramsPairwiseDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
    System.out.println("words: " + Arrays.toString(words));

    // Expect the groups in the order their first words appear:
    // [eat, tea, ate], [tan, nat], [bat].
    List<List<String>> groups = GroupAnagramsPairwise.groupAnagrams(words);
    System.out.println("groups:");
    for (int i = 0; i < groups.size(); i++) {
      List<String> group = groups.get(i);
      String[] members = new String[group.size()];
      for (int j = 0; j < group.size(); j++) {
        members[j] = group.get(j);
      }
      System.out.println("  " + Arrays.toString(members));
    }
  }
}
