Given an integer x, return true if x is a  palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
  
Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:
  
Constraints:       -231 <= x <= 231 - 1

SOLUTION :
  
public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {         // Negative numbers and numbers ending in 0 (but not 0 itself) cannot be palindromes
            return false;
        }
        int reversed = 0, original = x;
        // Reversing the number
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;                    // Check if the original number is equal to the reversed number
    }
