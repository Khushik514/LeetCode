/*
https://leetcode.com/problems/first-unique-character-in-a-string/
*/
class Solution {
    public int firstUniqChar(String s) {
        int ind = Integer.MAX_VALUE;
        int id;
        for(char i = 'a'; i <= 'z'; i++)
        {
            id = s.indexOf(i);
            if(id != -1 && s.lastIndexOf(i) == id)
                ind = Math.min(ind, s.indexOf(i));
        }
        return ind == Integer.MAX_VALUE ? -1 : ind;
    }
}