
Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation: Digit 8 is inside of 3 nested parentheses in the string.

import java.util.Stack;

class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int count = 0;
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                brackets.push(')');
                count++;
            } else if (s.charAt(i) == ')') {
                depth = Math.max(depth, count);
                count--;
                brackets.pop();
            }
        }
        return depth;
    }
}
