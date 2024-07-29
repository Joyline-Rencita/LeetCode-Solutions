Given a string s consisting of words and spaces, return the length of the last word in the string. A word is a maximal substring consisting of non-space characters only.
  
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();//To Remove spaces from start and ends of the whole string
        //From start we will start to read String
        int start = s.length() - 1;
        for(int i=start; i >= 0; i--){
            //Until we find space, we will iterate.
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}
