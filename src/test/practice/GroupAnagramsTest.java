package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the Group Anagrams problem. The scenarios are written once here;
 * each solution gets its own subclass that says which method to call, so you
 * can run the suite for one solution at a time.
 *
 * <p>Neither the order of the groups nor the order of the words in a group is
 * specified. So every assertion first puts both sides in one standard order
 * (sort the words in each group, then sort the groups) before comparing.
 */
public abstract class GroupAnagramsTest {

  // Calls the solution under test.
  protected abstract List<List<String>> groupAnagrams(String[] words);

  @Test
  public void theExampleFromTheProblem() {
    String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> expected = new ArrayList<>();
    expected.add(Arrays.asList("eat", "tea", "ate"));
    expected.add(Arrays.asList("tan", "nat"));
    expected.add(Arrays.asList("bat"));
    assertEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void emptyInputGivesNoGroups() {
    String[] words = {};
    List<List<String>> expected = new ArrayList<>();
    assertEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void aWordWithNoPartnerFormsAGroupOfOne() {
    String[] words = {"bat"};
    List<List<String>> expected = new ArrayList<>();
    expected.add(Arrays.asList("bat"));
    assertEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void aRepeatedWordJoinsItsFirstCopy() {
    String[] words = {"tea", "tea"};
    List<List<String>> expected = new ArrayList<>();
    expected.add(Arrays.asList("tea", "tea"));
    assertEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void wordsWithTheSameLettersInDifferentCountsAreApart() {
    String[] words = {"aab", "abb", "bab"};
    List<List<String>> expected = new ArrayList<>();
    expected.add(Arrays.asList("aab"));
    expected.add(Arrays.asList("abb", "bab"));
    assertEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void noTwoWordsAreAnagrams() {
    String[] words = {"cat", "dog", "cow"};
    List<List<String>> expected = new ArrayList<>();
    expected.add(Arrays.asList("cat"));
    expected.add(Arrays.asList("dog"));
    expected.add(Arrays.asList("cow"));
    assertEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  // Puts a grouping in one standard order, so two correct groupings that
  // differ only in order compare equal: sort each group, then sort the groups
  // by their string form.
  private static List<List<String>> normalize(List<List<String>> groups) {
    List<List<String>> copy = new ArrayList<>();
    for (List<String> group : groups) {
      List<String> inner = new ArrayList<>(group);
      Collections.sort(inner);
      copy.add(inner);
    }
    Collections.sort(copy, new Comparator<List<String>>() {
      @Override
      public int compare(List<String> a, List<String> b) {
        return a.toString().compareTo(b.toString());
      }
    });
    return copy;
  }
}
