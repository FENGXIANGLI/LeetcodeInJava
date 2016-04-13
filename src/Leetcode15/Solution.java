package Leetcode15;
import java.util.*;

import com.sun.glass.ui.Robot;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> testNew = new LinkedList<List<Integer>>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || i > 0 && nums[i] != nums[i-1]) {
				int sum = 0 - nums[i];
				int left = i+1;
				int right = nums.length - 1;
				while (left < right) {
					if (nums[left] + nums[right] == sum) {
						testNew.add(Arrays.asList(nums[i],nums[left],nums[right]));
						while (nums[left] == nums[left +1]) {
							left ++;
						}
						while (nums[right] == nums[right -1]) {
							right --;
						}
						left ++ ;
						right -- ;
					}else if (nums[left] + nums[right] < sum) {
						left ++;
					}else {
						right --;
					}
				}
			}
		}
		return testNew;
	}


	public static void main(String[] args) {
		Solution testSolution = new Solution();
		List<List<Integer>> testNew = testSolution.threeSum(new int[]{-1,0,1,2,-1,4});
		//		-1,-1,0,1,2,4
	}
}
