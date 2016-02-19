package Leetcode286;
// O(mn)

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.omg.CORBA.PRIVATE_MEMBER;

import sun.invoke.empty.Empty;

public class exampleSolution {
	private static final int GATE = 0;
	private static final int WALL = -1;
	private static final int EMPTY = Integer.MAX_VALUE;
	private static final List<int[]> DIRECTION= Arrays.asList(new int[]{1,0}, new int[]{-1,0}, new int[]{0,1}, new int[]{0,-1}); 
	public void wallsAndGates(int[][] rooms) {
		int m = rooms.length;
		if (m == 0) {
			return;
		}
		int n = rooms[0].length;
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[0].length; j++) {
				if (rooms[i][j] == GATE) {
					q.add(new int[]{i,j});
				}
			}
		}
		
		while (!q.isEmpty()) {
			int[] currentPoint = q.poll();
			for (int[] direction : DIRECTION) {
				int row = currentPoint[0] +direction[0];
				int col = currentPoint[1] +direction[1];
				if (row < 0 || col < 0 || row >= m|| col >= n ||rooms[row][col]!= EMPTY ) {
					continue;
				}
				rooms[row][col] = rooms[currentPoint[0]][currentPoint[1]]+1;
				q.add(new int[]{row,col});
			}
		}
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
