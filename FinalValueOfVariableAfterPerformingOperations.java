/*
https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
*/
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String s : operations)
        {
            if(s.indexOf("++") >= 0)
                x++;
            else
                x--;
        }
        return x;
    }
}