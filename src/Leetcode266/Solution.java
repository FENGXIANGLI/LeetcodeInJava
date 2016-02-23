package Leetcode266;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;


public class Solution {
	public boolean canPermutePalindrome(String s) {
		BitSet testSet = new BitSet();
		for (char c : s.toCharArray()) {
			testSet.flip(c);
		}
		return testSet.cardinality() < 2;
	}
	public static void main(String[] args) {
		Solution testSolution = new Solution();
		boolean testBoolean = testSolution.canPermutePalindrome("as");
		System.out.println(testBoolean);
	}
}
