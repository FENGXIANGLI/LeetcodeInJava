package LeetCode249;

import java.util.*;


public class Solution {
	private String recordString = null;
	public List<List<String>> groupStrings(String[] strings) {
		Map<String, List<String>> inputMap = new HashMap<String, List<String>>();
		Arrays.sort(strings);
		for (String string : strings) {
			char[] charArray = string.toCharArray();
			if (!compareKeySet(inputMap.keySet(), charArray)) {
				inputMap.put(string, new ArrayList<String>());
				recordString = string;
			}
			inputMap.get(recordString).add(string);
		}
		return new ArrayList<List<String>>(inputMap.values());
	}

	public boolean compareKeySet(Set<String> compareArray, char[] comparedArray) {
		if (compareArray.size() == 0 || compareArray == null) {
			return false;
		}
		outerLoop: for (String string : compareArray) {
			char[] testStringArray = string.toCharArray();
			if (testStringArray.length != comparedArray.length) {
				continue;
			}
			int compareInt = (comparedArray[0] - testStringArray[0])%26;
			for (int i = 1; i < comparedArray.length; i++) {
				int testInt = comparedArray[i] < testStringArray[i]? comparedArray[i] + 26 - testStringArray[i]:comparedArray[i] - testStringArray[i] ;
				if (compareInt != testInt) {
					continue outerLoop;
				}
			}
			recordString = string;
			return true; 
		}
		return false;
	}

	public static void main(String[] args) {
		Solution testSolution = new Solution();
		List<List<String>> outputSolution = testSolution.groupStrings(new String[]{"az","yx"});
	}
}
