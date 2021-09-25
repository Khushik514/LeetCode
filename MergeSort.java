class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    void merge(int[] nums, int left, int mid, int right)
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++)
            L[i] = nums[left + i];
        for(int i = 0; i < n2; i++)
            R[i] = nums[mid + 1 + i];
        int i = 0, j = 0, k = left;
        while(i < n1 || j < n2)
        {
            if(i >= n1)
            {
                nums[k] = R[j];
                j++;
            }
            else if(j >= n2)
            {
                nums[k] = L[i];
                i++;
            }
            else if(L[i] < R[j])
            {
                nums[k] = L[i];
                i++;
            }
            else
            {
                nums[k] = R[j];
                j++;
            }
            k++;
        }
    }
}