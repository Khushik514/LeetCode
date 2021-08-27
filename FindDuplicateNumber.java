class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int [nums.length];
        int i = 0;
        while (arr[nums[i]] == 0){
            arr[nums[i]] = 1;
            i++;
        }
        return nums[i];
    }
}
/*
Alternate Solution
class Solution {
    public int findDuplicate(int[] nums) {
        if (nums.length > 1)
        {
            int slow = nums[0];
            int fast = nums[nums[0]];
            int i=0;
            while (slow != fast)
            {
                slow = nums[slow];
                fast = nums[nums[fast]];
                i++;
            }
            System.out.println("i: "+i);

            fast = 0;
            while (fast != slow)
            {
                fast = nums[fast];
                slow = nums[slow];
                i++;
            }
            System.out.println("i: "+i);
            return slow;
        }
        return -1;
    }
    
}
*/
/*
https://leetcode.com/problems/find-the-duplicate-number/
*/