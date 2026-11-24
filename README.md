# Hashing — Practice

Two practice problems: find the pair in an unsorted array that adds up to a target (Two Sum); and group the words that use the same letters (Group Anagrams). Two Sum has one solution and Group Anagrams has two. A JUnit scenario suite for each problem runs against one solution at a time or all of them.

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
        TwoSumMap.java                  # one pass with a map
        GroupAnagramsPairwise.java      # compare each word with every group
        GroupAnagramsCanonicalForm.java # key a map on each word's sorted letters
      demo/                             # one demo per solution class
        TwoSumMapDemo.java
        GroupAnagramsPairwiseDemo.java
        GroupAnagramsCanonicalFormDemo.java
      list/
        List.java                       # the List ADT
        ArrayList.java                  # an array-backed List
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
        GroupAnagramsTest.java                  # the scenarios, written once
        GroupAnagramsCanonicalFormTest.java     # runs them against the canonical-form solution
        GroupAnagramsPairwiseTest.java          # runs them against the pairwise solution
  scripts/
    test.sh                             # compile and run the JUnit tests
    run.sh                              # compile and run one demo
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite: every scenario is checked against every solution of each problem.
- `scripts/test.sh practice.TwoSumMapTest` — compiles everything and runs the scenarios against one solution only. Use this while you are working on one solution and the others are still empty. The class names are listed in the layout above.
- `scripts/run.sh demo.TwoSumMapDemo` — compiles everything and runs that one demo. Every solution class has its own demo, `<Class>Demo`.

Each problem's scenarios live in one abstract test class (`TwoSumTest`, `GroupAnagramsTest`). The small classes that extend it do nothing but say which class to call, so the same scenarios run against every solution without being copied.

## What's here

- `practice.TwoSumMap` — `twoSum`, which traverses the array once with a map from each value to its index.
- `practice.GroupAnagramsPairwise` — `groupAnagrams`, which compares each word with the first word of every group so far.
- `practice.GroupAnagramsCanonicalForm` — `groupAnagrams`, which keys a map on each word's sorted letters.
- `demo.TwoSumMapDemo`, `demo.GroupAnagramsPairwiseDemo`, and `demo.GroupAnagramsCanonicalFormDemo` — one demo per solution class, each on the example the notes trace.
- `list.List<T>` and `list.ArrayList<T>` — the List ADT and its array-backed implementation. Both Group Anagrams solutions return their groups as lists.
- `map.Map<K, V>`, `map.TreeMap<K, V>`, `stack.Stack<T>`, and `stack.LinkedStack<T>` — the map from the TreeMap chapter and the stack its iterator uses.

These classes are copied unchanged from earlier chapters so this code compiles and runs on its own.
