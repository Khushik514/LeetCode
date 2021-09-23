/*
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int[] count = new int[n + 1];
        for(int i = 0; i < n; i++)
            count[nums[i]]++;
        for(int i = 1; i <= n; i++)
        {
            if(count[i] == 0)
                res.add(i);
        }
        System.gc();
        return res;
    }
}