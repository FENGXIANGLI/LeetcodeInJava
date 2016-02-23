package LeetCode296;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public int minTotalDistance(int[][] grid) {
		List<Integer> col = getColSorted(grid);
		List<Integer> row = getRowSorted(grid);
		
		return calculateMinDistance(col) + calculateMinDistance(row);
	}
	
	public int calculateMinDistance(List<Integer> list) {
		int distance = 0;
		int i = 0;
		int j = list.size() - 1;
		while (i < j) {
			distance += list.get(j) - list.get(i);
			i ++ ;
			j -- ;
		}
		return distance;
	}
	
	public List<Integer>  getRowSorted(int[][] grid) {
		List<Integer> colList = new ArrayList<>();
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col] == 1) {
					colList.add(row);
				}
			}
		}
		return colList;
	}
	
	public List<Integer> getColSorted(int[][] grid) {
		List<Integer> rowList = new ArrayList<>();
		for (int col = 0; col < grid[0].length; col++) {
			for (int row = 0; row < grid.length; row++) {
				if (grid[row][col] == 1) {
					rowList.add(col);
				}
			}
		}
		return rowList;
	}
	public static void main(String[] args) {
		Solution testSolution = new Solution();
		int[][] grid = {{1,0,0,0,1},{0,0,0,0,0},{0,0,1,0,0}};
		int minDistance = testSolution.minTotalDistance(grid);
	}
}
