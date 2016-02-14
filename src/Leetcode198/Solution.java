package Leetcode198;

import java.util.Iterator;

public class Solution {
	public int rob(int[] nums) {
//		return 
		int prevMax = 0;
		int currMax = 0;
		for (int i : nums) {
			int temp = currMax;
			currMax = Math.max(prevMax + i, currMax);
			prevMax = temp;
		}
		return currMax;
	}
}
