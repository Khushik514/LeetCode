/*
https://leetcode.com/problems/reverse-integer/
*/
class Solution {
    public int reverse(int x) {
        boolean p = (x < 0) ? true : false;
        x = Math.abs(x);
        long rev = 0;
        try{
            while(x > 0)
            {
                rev = rev * 10 + (x % 10);
                x = x / 10;
                if(rev >= Integer.MAX_VALUE)
                    return 0;
            }
            if(p == false && rev <= Integer.MAX_VALUE)
                return (int)rev;
            else if(rev <= Integer.MAX_VALUE)
                return (int)-rev;
            else
                return 0;
        }
        catch(Exception e)
        {
            return 0;
        }
    }
}