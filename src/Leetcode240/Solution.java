package Leetcode240;
// reduce from the rop right
public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		int width = matrix[0].length - 1;
		int height = 0;
		while (true) {
			if (matrix[height][width] > target) {
				width -= 1;
			}else if (matrix[height][width] < target) {
				height += 1;
			}else {
				return true;
			}
			if (width == -1 || height == matrix.length) {
				return false;
			}
		}
	}
	public static void main(String[] args) {
		Solution testSolution = new Solution();
//		int[][] matrix = new int[][]{
//			{1,4,7,11,15},
//			{2,   5,  8, 12, 19},
//			{3,   6,  9, 16, 22},
//			{10, 13, 14, 17, 24},
//			{18, 21, 23, 26, 30}
//		};
		int [][] matrix = new int[][]{
			{1,1}
		};
		System.out.println(testSolution.searchMatrix(matrix, 30));
	}
}
