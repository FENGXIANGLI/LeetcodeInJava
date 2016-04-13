package Leetcode16;

import java.util.Arrays;
import java.util.Iterator;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		int result = nums[0] + nums[1] +nums[nums.length - 1]; 
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int first = i;
			int start = first + 1;
			int end = nums.length - 1;
			while (start < end) {
				if ( Math.abs(nums[start] + nums[end] - target+nums[first]) < Math.abs(result - target)) {
					result = nums[start] + nums[end] +nums[first];
				}
				if (nums[start] + nums[end] < target - nums[first]) {
					start ++;
				}else {
					end --;
				}

			}
		}
		return result;
	}
	public static void main(String[] args) {
		Solution testSolution = new Solution();
		int testUs = testSolution.threeSumClosest(new int []{0,2,1,-3}, 1);
		System.out.println(testUs);
	}
}
