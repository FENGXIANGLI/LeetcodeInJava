package Leetcode74;
public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		int up = 0;
		int down = matrix.length - 1;
		int middleRow = up + (down - up) /2;
		while (up <= down) {
			middleRow = up + ((down - up)>>1);
			if (matrix[middleRow][0] == target) {
				break;
			}else if (matrix[middleRow][0] > target) {
				down = middleRow - 1;
			}else {
				up = middleRow + 1;
			}
		}
		if (matrix[middleRow][0] > target && middleRow != 0) {
			middleRow -= 1;
		}
		int left = 0;
		int right = matrix[0].length - 1;
		while (left <= right) {
			int middleColumn = left + (right - left)/2;
			if (matrix[middleRow][middleColumn] == target) 
				return true;
			if (matrix[middleRow][middleColumn] > target) {
				right = middleColumn - 1;
			}else {
				left = middleColumn + 1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Solution testSolution = new Solution();
		int[][] testMatrix = new int[][]{
			{1},
			{3},
			{5}
		};
		System.out.println(testSolution.searchMatrix(testMatrix,6));
	}
}


