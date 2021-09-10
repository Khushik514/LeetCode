/*
https://leetcode.com/problems/string-to-integer-atoi/
*/
class Solution {
    public int myAtoi(String s) {
     if (s == null || s.isEmpty()) {
		return 0;
	}

	int start = 0;
	while (start < s.length() && s.charAt(start) == ' ') {
		start++;
	}

	if (start == s.length()) {
		return 0;
	}

	if (s.charAt(start) - '0' > 9) {
		return 0;
	}

	boolean isNegative = false;
	if (s.charAt(start) == '+') {
		start++;
	} else if (s.charAt(start) == '-') {
		start++;
		isNegative = true;
	}

	long result = 0;
	for (int i = start; i < s.length(); i++) {
		long digit = s.charAt(i) - '0';

		if (digit < 0 || digit > 9) {
			return (int) result;
		}

		if (isNegative) {
			result = result * 10 - digit;

			if (result < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
		} else {
			result = result * 10 + digit;

			if (result > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
		}
	}

	return (int) result;  }
}