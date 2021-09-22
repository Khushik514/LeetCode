/*
https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
*/
class Solution {
    public double average(int[] salary) {
        int max = salary[0], min = salary[0];
        double sum = 0;
        for(int i : salary)
        {
            if(i > max)
                max = i;
            if(i < min)
                min = i;
            sum = sum + i;
        }
        return (sum - min- max) / (salary.length - 2);
    }
}