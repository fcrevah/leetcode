package org.fcrevah;

import org.fcrevah.arrays.ContainsDuplicate;
import org.fcrevah.arrays.ValidAnagram;
import org.fcrevah.arrays.TwoSum;
import org.fcrevah.pointers.ValidPalindrome;
import org.fcrevah.slidingwindow.BuyAndSellStock;
import org.fcrevah.stack.ValidParenthases;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*int[] twoSum = TwoSum.twoSum(new int[] {2, 7, 11, 8}, 10);
        System.out.println(Arrays.toString(twoSum));

        boolean isPalindrome = ValidPalindrome.isPalindrome("radcecar");
        System.out.println(isPalindrome);

        int maxProfit = BuyAndSellStock.maxProfit(new int[] {7, 1, 5, 3, 6, 4});
        System.out.println(maxProfit);*/

        boolean validParenthases = ValidParenthases.isValid("([]))");
        System.out.println(validParenthases);
    }
}