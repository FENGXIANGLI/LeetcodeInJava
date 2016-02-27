package LeetCode303;

// Given an integer array nums, find the sum of the elements between indices i and j (i 鈮� j), inclusive.


// You may assume that the array does not change.
// There are many calls to sumRange function.

// times:O(1) space: O(n)
// java鏁扮粍鍒濆鍖栧悗榛樿鏄�0
public class Solution {

private int[] sum;

    public Solution(int[] nums) {
        sum = new int [nums.length + 1];
        for (int i = 0 ; i< nums.length; i++) {
        	sum[i+1] = sum[i] + nums[i]; 
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