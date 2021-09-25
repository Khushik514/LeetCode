/*
https://leetcode.com/problems/valid-palindrome/
*/
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int low = 0;
        int high = s.length() - 1;
        char l, h;
        while(low < high)
        {
            l = s.charAt(low);
            h = s.charAt(high);
            if(Character.isLetterOrDigit(l) == false)
                low++;
            else if(Character.isLetterOrDigit(h) == false)
                high--;
            else if(l != h)
                return false;
            else
            {
                low++;
                high--;
            }
        }
        return true;
    }
}