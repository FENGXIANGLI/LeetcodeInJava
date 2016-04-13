package TestSort;

import java.util.Arrays;

public class Solution {
	public int  binarySearch(int[] nums, int target) throws Exception {
		Arrays.sort(nums);
		int left = 0;
		int right = nums.length - 1;
		int middle = left + (right - left)/2; 
		while (left <= right) {
			if (nums[middle] == target) {
				return middle;
			}
			if (nums[middle] < target) {
				left = middle + 1;
			}else {
				right = middle - 1 ;
			}
			middle = left + (right - left)/2; 
		}
		throw new Exception("asfdasf");

	}
	public static void main(String[] args) throws Exception {
		Solution testSolution = new Solution();
		int result = testSolution.binarySearch(new int[] {2,3,5,6,7,8,10,11,12},1);
		System.out.println(result);
	}
}
