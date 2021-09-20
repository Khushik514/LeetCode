/*
https://leetcode.com/problems/powx-n/
*/
class Solution {
    public double myPow(double x, int n) {
        double res = 1, pow = x;
        while(n != 0)
        {
            if(n % 2 == 1) 
                res = res * pow;
            if(n % 2 == -1) 
                res = res / pow;
            n = n / 2;
            pow = pow * pow;
        }
        return res;
    }
}