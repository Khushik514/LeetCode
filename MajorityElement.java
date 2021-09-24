/*
https://leetcode.com/problems/majority-element/
*/
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;
        for(int i : nums)
        {
            if(count == 0)
            {
                major = i;
            }
            if(i == major)
                count++;
            else
                count--;
        }
        return major;
    }
}