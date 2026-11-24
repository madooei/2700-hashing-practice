package demo;

import java.util.Arrays;
import list.List;
import practice.GroupAnagramsCanonicalForm;

/** A demo of GroupAnagramsCanonicalForm on the example the notes trace. */
public final class GroupAnagramsCanonicalFormDemo {

  private GroupAnagramsCanonicalFormDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
    System.out.println("words: " + Arrays.toString(words));

    // The map keeps its keys "abt", "aet", "ant" in sorted order,
    // so expect [bat], [eat, tea, ate], [tan, nat].
    List<List<String>> groups = GroupAnagramsCanonicalForm.groupAnagrams(words);
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
