package org.fcrevah.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    // https://leetcode.com/problems/contains-duplicate
    public static boolean containsDuplicate(int[] originalArray) {
        Set<Integer> numSet = new HashSet<>(IntStream.of(originalArray).boxed().collect(Collectors.toSet()));
        return numSet.size() != originalArray.length;
    }

    public static boolean containsDuplicate_alternate(int[] originalArray) {
        Set<Integer> numSet = new HashSet<>();
        for (int i: originalArray) {
            if (numSet.contains(i))
                return true;
            numSet.add(i);
        }
        return false;
    }
}
