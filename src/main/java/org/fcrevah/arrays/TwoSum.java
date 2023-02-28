package org.fcrevah.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> iterated = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (iterated.containsKey(target - nums[i]))
                return new int[] {iterated.get(target - nums[i]), i};
            iterated.put(nums[i], i);
        }
        return null;
    }
}
