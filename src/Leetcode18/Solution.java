package Leetcode18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> sumList = new LinkedList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-3; i++) {
			if (i == 0|| i > 0 && nums[i] != nums[i -1]) {
				for (int j = i+1; j < nums.length - 2; j++) {
					if (j == i+1 || j > i+1 && nums[j] != nums[j-1]) {
						int sum = target - nums[i] - nums[j];
						int left = j +1;
						int right = nums.length - 1;
						while (left < right) {
							if (nums[left] + nums[right] == sum) {
								sumList.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
								while (left < right&&nums[left] == nums[left +1]) {
									left ++;
								}
								while (left < right&&nums[right] == nums[right -1]) {
									right --;
								}
								left ++;
								right --;
							}else if (nums[left] + nums[right] < sum) {
								left ++;
							}else {
								right --;
							}
							
						}
					}
				}
			}
		}
		return sumList;
	}
	public static void main(String[] args) {
		Solution testSolution = new Solution();
		List<List<Integer>> te = testSolution.fourSum(new int[]{1,0,-1,0,-2,2}, 0);
	}
}
