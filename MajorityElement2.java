/*
https://leetcode.com/problems/majority-element-ii/
*/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int m1 = -1;
        int m2 = -1;
        int n = nums.length;
        for(int i : nums)
        {
            if(i == m1)
                c1++;
            else if(i == m2)
                c2++;
            else if(c1 == 0)
            {
                m1 = i;
                c1 = 1;
            }
            else if(c2 == 0)
            {
                m2 = i;
                c2 = 1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        List<Integer> res = new ArrayList<>();
        for(int i : nums)
        {
            if(i == m1)
                c1++;
            else if(i == m2)
                c2++;
        }
        if(c1 > n / 3)
            res.add(m1);
        if(c2 > n / 3)
            res.add(m2);
        return res;
    }
}