package LeetCode280;

import java.util.Arrays;

//Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

//For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].

public class Solution {
	public void wiggleSort(int[] nums) {
		Arrays.sort(nums);
		int[] sortedArray = new int[nums.length];
		int pointer = 0;
		if (nums.length == 1 || nums.length == 0) {
			return;
		}
		for (int i = 0; i < nums.length/2; i++) {
			sortedArray[pointer] = nums[i];
			pointer ++ ;
			sortedArray[pointer] = nums[nums.length - 1 - i];
			pointer ++ ;
			if (pointer == nums.length - 1 && nums.length % 2 == 1) {
				sortedArray[pointer] = nums[i+1];
			}
		}	
		for (int i = 0; i < sortedArray.length; i++) {
			nums[i] = sortedArray[i];
		}
	}
	
	public static void main(String[] args) {
		Solution testClass = new Solution();
		int [] nums = {1};
		testClass.wiggleSort(nums);
		String returnNumString = Arrays.toString(nums);
		System.out.println(returnNumString);
//		System.out.println(nums);
	}
}
