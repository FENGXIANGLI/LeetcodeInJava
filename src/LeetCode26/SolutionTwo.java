package LeetCode26;

public class SolutionTwo {
	public int removeDuplicates(int [] nums) {
		int sum = 0;
		if (nums.length == 0) {
			return 0;
		}
		for (int i = 0 ; i < nums.length ; i++) {
			if (nums[i] > nums[sum]) {
				sum += 1;
				nums[sum] = nums[i];
			} 
		}
		return sum + 1;
	}
	public static void main(String[] args) {
		SolutionTwo testSolutionTwo = new SolutionTwo();
		System.out.println(testSolutionTwo.removeDuplicates(new int[]{1,1,2,2,3,3,3,4,5,6}));
	}
}
