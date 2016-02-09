import java.util.*;
public class Solution {
    public int removeDuplicates(int[] nums) {
    	if (nums.length == 0) {
    		return 0;
    	}else{
    		int i = 0;
    		for (int j = 0; j < nums.length; j++ ) {
    			if (nums[i] != nums[j]) {
    				i++;
    				nums[i] = nums[j];
    			}
    		}
    		return i + 1;
    	}
    }
    public static void main(String[] args) {
    	Solution testSolution = new Solution();
    	int[] nums = {1,2,3,7,8,8,8,8,9,10};
    	int returnNum = testSolution.removeDuplicates(nums);
    	String returnNumString = Arrays.toString(nums);
		System.out.println(returnNum);
		System.out.println(returnNumString);
    }
}    