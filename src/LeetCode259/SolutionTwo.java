package LeetCode259;
import java.util.Arrays;;

public class SolutionTwo {
	public int threeSumSmaller(int[] nums,int target) {
		Arrays.sort(nums);
		int sum =0;
		for (int i = 0; i < nums.length - 2; i++) {
			sum += twoSumSmaller(nums, i +1, target - nums[i]);
		}
		return sum;


	}
	public int twoSumSmaller(int[] nums, int startIndex, int target) {
		int left = startIndex;
		int right = nums.length-1;
		int sum = 0;
		while (left < right) {
			if (nums[left] + nums[right] < target) {
				sum += right - left;
				left ++;
			} else {
				right --;
			}	
		}
		return sum;
	}

	public static void main(String[] args) {
		SolutionTwo testTwo = new SolutionTwo();
		int [] nums = {-1,0,1,2,3};
		System.out.print(testTwo.threeSumSmaller(nums, 2));
	}

}
