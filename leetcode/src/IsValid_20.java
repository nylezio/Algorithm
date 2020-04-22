//有效的括号
//应用栈

import java.util.HashMap;
import java.util.Stack;

/**
 * Author: CHNjerry
 * Date: 2020/03/11 22:45
 */
public class IsValid_20 {

    public static boolean isValid(String s) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the current character is a closing bracket.
            if (hashMap.containsKey(c)) {
                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();
                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != hashMap.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "()";
        Boolean bool = isValid(s);
        System.out.println(bool);
    }
}
