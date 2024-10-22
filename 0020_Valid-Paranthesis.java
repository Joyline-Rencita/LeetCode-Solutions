class Solution {
    public boolean isValid(String s) {
        // If the length of string is odd, it cannot be valid.
        if (s.length() % 2 != 0) return false;

        // Create a Stack to keep track of opening brackets.
        Stack<Character> stack = new Stack<>();
        // Iterate through each character in the input string.
        for (char c : s.toCharArray()) {
            // Push the corresponding closing bracket for each opening bracket onto the stack.
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                // If stack is empty or top does not match with the closing bracket, return false.
                return false;
            }
        }
        // If stack is empty, all the opening brackets had a matching closing pair.
        return stack.isEmpty();
    }
}
