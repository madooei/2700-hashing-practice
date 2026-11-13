package practice;

import java.util.Arrays;
import list.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Tests for the Group Anagrams problem. The scenarios are written once here;
 * each solution gets its own subclass that says which class to call, so you
 * can run the suite for one solution at a time.
 *
 * Neither the order of the groups nor the order of the words in a group is
 * specified. So every assertion first puts both sides in one standard order
 * before comparing.
 */
public abstract class GroupAnagramsTest {

  // Calls the solution under test.
  protected abstract List<List<String>> groupAnagrams(String[] words);

  @Test
  public void emptyInputGivesNoGroups() {
    String[] words = {};
    String[][] expected = {};
    assertArrayEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void aWordWithNoPartnerFormsAGroupOfOne() {
    String[] words = {"bat"};
    String[][] expected = {{"bat"}};
    assertArrayEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void twoAnagramsShareAGroup() {
    String[] words = {"eat", "tea"};
    String[][] expected = {{"eat", "tea"}};
    assertArrayEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void aRepeatedWordJoinsItsFirstCopy() {
    String[] words = {"tea", "tea"};
    String[][] expected = {{"tea", "tea"}};
    assertArrayEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void noTwoWordsAreAnagrams() {
    String[] words = {"cat", "dog", "cow"};
    String[][] expected = {{"cat"}, {"dog"}, {"cow"}};
    assertArrayEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void wordsWithTheSameLettersInDifferentCountsAreApart() {
    String[] words = {"aab", "abb", "bab"};
    String[][] expected = {{"aab"}, {"abb", "bab"}};
    assertArrayEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void wordsWhoseLettersHaveTheSameSumAreApart() {
    String[] words = {"ad", "bc"};
    String[][] expected = {{"ad"}, {"bc"}};
    assertArrayEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  @Test
  public void groupsOfDifferentSizesFromMixedInput() {
    String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
    String[][] expected = {{"eat", "tea", "ate"}, {"tan", "nat"}, {"bat"}};
    assertArrayEquals(normalize(expected), normalize(groupAnagrams(words)));
  }

  // Puts a grouping in one standard order, so two correct groupings that
  // differ only in order compare equal: sort each group, write it as a string,
  // then sort those strings.
  private static String[] normalize(List<List<String>> groups) {
    String[] normalized = new String[groups.size()];
    for (int i = 0; i < groups.size(); i++) {
      List<String> group = groups.get(i);
      String[] words = new String[group.size()];
      for (int j = 0; j < group.size(); j++) {
        words[j] = group.get(j);
      }
      Arrays.sort(words);
      normalized[i] = Arrays.toString(words);
    }
    Arrays.sort(normalized);
    return normalized;
  }

  // The same standard order, for an expected grouping written as an array.
  private static String[] normalize(String[][] groups) {
    String[] normalized = new String[groups.length];
    for (int i = 0; i < groups.length; i++) {
      String[] words = Arrays.copyOf(groups[i], groups[i].length);
      Arrays.sort(words);
      normalized[i] = Arrays.toString(words);
    }
    Arrays.sort(normalized);
    return normalized;
  }
}
