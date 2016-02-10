// Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.


// You may assume that the array does not change.
// There are many calls to sumRange function.

// times:O(1) space: O(n)
public class NumArray {

private int[] sum;

    public NumArray(int[] nums) {
        sum = new int [nums.length + 1];
        sum[0] = 0;
        for (int i =1; i< nums.length +1; i++) {
        	sum[i] = sum[i - 1] + nums[i - 1]; 
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+1]- sum[i];
    }
}

// Dear Prof mfelker,
// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);