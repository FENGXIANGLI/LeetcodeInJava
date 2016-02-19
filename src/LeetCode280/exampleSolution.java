package LeetCode280;

import java.util.Arrays;

import javax.print.attribute.standard.NumberUpSupported;

import sun.launcher.resources.launcher;
public class exampleSolution {
	//	public void wiggleSort(int[] nums) {
	//		Arrays.sort(nums);
	//		for (int i = 1; i < nums.length -1; i+=2) {
	//			int temp = nums[i];
	//			nums[i] = nums[i+1];
	//			nums[i+1] = temp;
	//		}
	//	}
	public void wiggleSort(int[] nums) {
		boolean flag = true;
		for (int i = 0; i < nums.length-1; i++) {
			if (flag) {
				if (nums[i] < nums[i+1]) {
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			}else {
				if (nums[i] > nums[i+1]) {
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			}
			flag = !flag;
		}
	}

}
