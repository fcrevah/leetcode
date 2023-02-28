package org.fcrevah.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParenthases {

    public static boolean isValid(String s) {
        Deque<Character> parenthasesStack = new ArrayDeque<>();
        Map<Character, Character> matchingParenthases = new HashMap<>();
        matchingParenthases.put(']', '[');
        matchingParenthases.put('}', '{');
        matchingParenthases.put(')', '(');

        for (Character c: s.toCharArray()) {
            if (matchingParenthases.containsKey(c)) {
                if (parenthasesStack.isEmpty())
                        return false;
                if (!parenthasesStack.pop().equals(matchingParenthases.get(c)))
                    return false;
            } else
                parenthasesStack.push(c);
        }
        if (!parenthasesStack.isEmpty())
            return false;
        return true;
    }

}
