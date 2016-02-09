package LeetCode119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> lastRow = new ArrayList<Integer>();
		List<Integer> currentRow = new ArrayList<Integer>();
		int numTempRow = 0;
		while (numTempRow < rowIndex+1) {
			if (numTempRow == 0) {
				lastRow.clear();
				lastRow.add(1);
				currentRow.clear();
				currentRow.addAll(lastRow);
			}else if (numTempRow == 1) {
				currentRow.clear();
				currentRow.add(1);
				currentRow.add(1);
				lastRow.clear();
				lastRow.addAll(currentRow);
			}else {
				currentRow.clear();
				currentRow.add(1);
				for (int i = 0; i < lastRow.size() - 1; i++) {
					currentRow.add(lastRow.get(i)+lastRow.get(i+1));
				}
				currentRow.add(1);
				lastRow.clear();
				lastRow.addAll(currentRow);
			}
			numTempRow ++;
		}
		return currentRow;
	}
	
	public static void main(String[] args) {
		System.out.println(getRow(2));
	}
}
