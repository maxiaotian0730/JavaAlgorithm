package practise.a20200219;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author malu
 * @description: leetcode-20：有效括号
 * @date 2020/2/1921:39
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> parenthesesMap = new HashMap<Character, Character>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('[', ']');
        parenthesesMap.put('{', '}');

        s = s.replace(" ", "");
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (parenthesesMap.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                Character top = stack.empty() ? '?' : stack.pop();
                if(s.charAt(i) != parenthesesMap.getOrDefault(top,'?')){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = ")}";
        System.out.println(new ValidParentheses().isValid(s));
    }
}