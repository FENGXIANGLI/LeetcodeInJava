package Leetcode286;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.sun.istack.internal.FinalArrayList;

//INF  -1  0  INF
//INF INF INF  -1
//INF  -1 INF  -1
//  0  -1 INF INF

//breadth-first

//O(m2n2)
public class Solution {
	private static final int EMPTY = Integer.MAX_VALUE;
	private static final int Gate = 0;
	private static final int Wall = -1;
	private static final List<int[]> directions = Arrays.asList(new int[]{-1,0},new int[]{1,0}, new int[]{0,1},new int[]{0,-1});
	public void wallsAndGates(int[][] rooms) {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[0].length; j++) {
				if (rooms[i][j] == EMPTY) {
					rooms[i][j] = getNearestDis(rooms, i, j);
				}
			}
		}
	}

	public int getNearestDis(int[][] nums, int startRow,int startCol) {
		int m = nums.length;
		int n = nums[0].length;
		int[][] distance = new int[m][n];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {startRow, startCol});
		while (!q.isEmpty()) {
			int[] currentPoint = q.poll();
			int row = currentPoint[0];
			int col = currentPoint[1];
			for (int[] nextPoint : directions) {
				//				nextPoi
				int nextRow = row + nextPoint[0];
				int nextCol = col + nextPoint[1];
				if (nextCol < 0 || nextRow < 0 || nextRow >= m || nextCol  >= n || nums[nextRow][nextCol] == -1 || distance[nextRow][nextCol] != 0) {
					continue;
				}
				distance[nextRow][nextCol] = distance[row][col]+1;
				if (nums[nextRow][nextCol] == Gate) {
					return distance[nextRow][nextCol];
				}
				q.add(new int[]{nextRow,nextCol});
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		Solution testSolution = new Solution();
		//		 int a[][] = {{1,2},{3,4,5,6},{7,8,9}} ;
		int nums [][] = {{Integer.MAX_VALUE,-1,0,Integer.MAX_VALUE},{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,-1},{Integer.MAX_VALUE,-1,Integer.MAX_VALUE,-1},{0,-1,Integer.MAX_VALUE,Integer.MAX_VALUE}};
//		int nums [][] = {{Integer.MAX_VALUE,Integer.MAX_VALUE},{Integer.MAX_VALUE,Integer.MAX_VALUE}}; 
		testSolution.wallsAndGates(nums);
		System.out.println(nums.toString());
	}
}
