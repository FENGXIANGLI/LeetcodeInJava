package LeetCode259;

import java.util.Arrays;
public class Solution {
    public int threeSumSmaller(int[] nums, int target) {
    	Arrays.sort(nums);
    	int sum = 0;
        for (int i = 0;i< nums.length ;i++) {
        	for (int j = i + 1;j< nums.length;j++) {
        		int lastOne = binarySearch(nums, j, target - nums[i] - nums[j]);
        		sum += lastOne - j;
        	}
        }
        return sum;
    }

    public int binarySearch(int[] nums, int startIndex, int target){
    	int left = startIndex;
    	int right = nums.length - 1;
    	while (left < right) {
    		int mid = left + (right - left + 1)/2;
    		if (nums[mid] < target) {
    			left = mid;
    		}else {
    			right = mid - 1;
    		}
    	}
    	return left;
    }

    public static void main(String[] args) {
    	Solution testSolution = new Solution();
    	int[] nums = {1,0,-1};
    	int test = testSolution.threeSumSmaller(nums,1);
    	System.out.println(test);
    }
}
