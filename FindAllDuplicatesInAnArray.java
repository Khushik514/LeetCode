/*
https://leetcode.com/problems/find-all-duplicates-in-an-array/
*/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int d;
        for(int i = 0; i < n; i++)
        {
            d = Math.abs(nums[i]);
            if(nums[d - 1] < 0)
                res.add(d);
            else
                nums[d - 1] = - nums[d - 1];
        }
        System.gc();
        return res;
    }
}