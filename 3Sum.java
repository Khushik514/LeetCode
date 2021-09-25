/*
https://leetcode.com/problems/3sum/
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3)
            return new ArrayList<>();
        Arrays.sort(nums);
        int left, right;
        int n = nums.length;
        int curr;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < n - 2; i++)
        {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) 
            {
                left = i + 1;
                right = n - 1;
                curr = -nums[i];
                while (left < right) 
                {
                    if (nums[left] + nums[right] == curr) 
                    {
                        res.add(Arrays.asList(-curr, nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) 
                            left++;
                        while (left < right && nums[right] == nums[right - 1]) 
                            right--;
                        left++; 
                        right--;
                    } 
                    else if (nums[left] + nums[right] < curr)
                        left++;
                    else
                        right--;
                }
            }
        }
        return res;
    }
}