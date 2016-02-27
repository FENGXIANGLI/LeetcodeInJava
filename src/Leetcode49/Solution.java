package Leetcode49;

import java.util.*;

public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> returnGroup = new ArrayList<>();
		outerLoop:		for (String string : strs) {
			for (List<String> list : returnGroup) {
				if (isAnagram(string, list.get(0))) {
					list.add(string);
					continue outerLoop;
				}
			}
			List<String> insertList = new ArrayList<>();
			insertList.add(string);
			returnGroup.add(insertList);
		}
		return returnGroup;
	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] checkArray = new int[26];
		for (int i = 0; i < s.length(); i++) {
			checkArray[s.charAt(i) - 'a'] ++;
			checkArray[t.charAt(i) - 'a'] --;
		}
		for (int i : checkArray) {
			if (i!=0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Solution testSolution = new Solution();
		List<List<String>> outputSolution = testSolution.groupAnagrams(new String[]{});
	}
}
