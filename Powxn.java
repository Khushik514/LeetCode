/*
https://leetcode.com/problems/powx-n/
*/
class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;
        long num = n;
        if(n < 0)
            num = -1 * num;
        while(num > 0)
        {
            if(num % 2 == 0) 
            {
                x = x * x;
                num = num / 2;
            }
            else
            {
                res = res * x;
                num = num - 1;
            }
        }
        if(n < 0)
            return (double)(1.0 / res);
        else
            return res;
    }
}