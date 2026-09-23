package CompanWiseQuestions.cognizant.deloite;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis_20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (map.get(ch) != top) return false;
            }

        }
        return stack.isEmpty();
    }

    static void main() {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([)]"));
    }
}
