package cognizant;

import java.util.Stack;

public class ValidParenthesis_20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }

            }

        }
        return stack.isEmpty();
    }

    static void main() {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([)]"));
    }
}
