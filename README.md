# Hashing — Practice

Two practice problems: find the pair in an unsorted array that adds up to a target (Two Sum); and group the words that use the same letters (Group Anagrams). Two Sum and Group Anagrams each have two solutions, and a JUnit scenario suite for each problem runs against one solution at a time or all of them.

## Prerequisites

- JDK 17+ (JUnit 6 requires it).
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      practice/
        TwoSumBruteForce.java           # check every pair
        TwoSumMap.java                  # one pass with a map
        GroupAnagramsPairwise.java      # compare each word with every group
        GroupAnagramsCanonicalForm.java # key a map on each word's sorted letters
      map/
        Map.java                        # the Map ADT
        TreeMap.java                    # the AVL tree map from the TreeMap chapter
      stack/
        Stack.java                      # the Stack ADT, used by the map's iterator
        LinkedStack.java                # linked implementation of Stack
    test/
      practice/
        TwoSumTest.java                         # the scenarios, written once
        TwoSumMapTest.java                      # runs them against the map solution
        TwoSumBruteForceTest.java               # runs them against the brute-force solution
        GroupAnagramsTest.java                  # the scenarios, written once
        GroupAnagramsCanonicalFormTest.java     # runs them against the canonical-form solution
        GroupAnagramsPairwiseTest.java          # runs them against the pairwise solution
  scripts/
    test.sh                             # compile and run the JUnit tests
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite: every scenario is checked against every solution of each problem.
- `scripts/test.sh practice.TwoSumBruteForceTest` — compiles everything and runs the scenarios against one solution only. Use this while you are working on one solution and the others are still empty. The class names are listed in the layout above.
Neither problem has a demo; the tests are how you check your work.

Each problem's scenarios live in one abstract test class (`TwoSumTest`, `GroupAnagramsTest`). The small classes that extend it do nothing but say which class to call, so the same scenarios run against every solution without being copied.

## What's here

- `practice.TwoSumBruteForce` — `twoSum`, which checks every pair with two nested loops.
- `practice.TwoSumMap` — `twoSum`, which traverses the array once with a map from each value to its index.
- `practice.GroupAnagramsPairwise` — `groupAnagrams`, which compares each word with the first word of every group so far.
- `practice.GroupAnagramsCanonicalForm` — `groupAnagrams`, which keys a map on each word's sorted letters.
- `map.Map<K, V>`, `map.TreeMap<K, V>`, `stack.Stack<T>`, and `stack.LinkedStack<T>` — the map from the TreeMap chapter and the stack its iterator uses, copied unchanged so this code compiles and runs on its own.
