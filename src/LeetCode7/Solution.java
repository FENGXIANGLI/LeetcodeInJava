package LeetCodeSeven;

public class Solution {

	public static int reverse(int x) {
		final int MAX = Integer.MAX_VALUE/10;
		final int MIN = Integer.MIN_VALUE/10;
		int sum = 0;
		
		while (Math.abs(x) > 0) {
			int digit = x % 10;

			if (sum > MAX || sum < MIN || (sum == MAX && digit > 7) || (sum == MIN && digit < -8)) {
				return 0;
			}

			sum = sum * 10 + digit;
			x = x/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(reverse(0));
	}
}
