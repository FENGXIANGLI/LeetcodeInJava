package LeetcodeOneRectify;

import java.util.Arrays;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] resultArray = new int[2];
		int left = 0;
		int right = nums.length -1;
		while (left < right) {
			if (nums[left] + nums[right] == target) {
				resultArray[0] = left;
				resultArray[1] = right;
				return resultArray;
			}
			if (nums[left] + nums[right] < target) {
				left ++;
			}else {
				right -- ;
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args) {
		Solution testSolution = new Solution();
		int[] Array = testSolution.twoSum(new int[]{3,2,4}, 6);
	}
}
