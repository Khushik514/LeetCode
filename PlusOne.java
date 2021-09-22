/*
https://leetcode.com/problems/plus-one/
*/
class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        int temp;
        for(int i = n - 1; i >= 0; i--)
        {
            temp = digits[i] + carry;
            digits[i] = temp % 10;
            carry = temp / 10;
            //if carry is zero then no further alterations to be done
            if(carry == 0)
                return digits;
        }
        if(carry > 0)
        {
            int[] res = new int[n + 1];
            res[0] = carry;
            for(int i = 0; i < n; i++)
                res[i + 1] = digits[i];
            return res;
        }
        return digits;
    }
}