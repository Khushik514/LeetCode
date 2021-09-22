/*
https://leetcode.com/problems/jump-game/
*/
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return true;
        int availablejumps = nums[0];
        availablejumps--;
        for(int i = 1; i < n && availablejumps >= 0; i++, availablejumps--)
        {
            if(i + availablejumps >= n - 1)
                return true;
            availablejumps = Math.max(availablejumps, nums[i]);
        }
        return false;
    }
}