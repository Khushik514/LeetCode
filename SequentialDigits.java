/*
https://leetcode.com/problems/sequential-digits/
*/
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> res = new ArrayList<>();
        int n;
        for(int i = 1; i <= 9; i++)
        {
            for(int j = 0; j <= 9 - i; j++)
            {
                n = Integer.parseInt(digits.substring(j, j + i));
                if(n >= low && n <= high)
                    res.add(n);
            }
        }
        return res;
    }
}