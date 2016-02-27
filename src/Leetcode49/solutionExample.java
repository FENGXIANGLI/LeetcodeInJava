package Leetcode49;

import java.util.*;

public class solutionExample {
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0 || strs == null) {
			return new ArrayList<List<String>>();
		}
		Arrays.sort(strs);
		Map<String, List<String>> stringMap = new HashMap<String, List<String>>();
		for (String string : strs) {
			char[] discreteArray = string.toCharArray();
			Arrays.sort(discreteArray);
			String inputString = String.valueOf(discreteArray);
			if (!stringMap.containsKey(inputString)) {
				stringMap.put(inputString, new ArrayList<String>());
			}
			stringMap.get(inputString).add(string);
		}
		return new ArrayList<List<String>>(stringMap.values());
	}
	public static void main(String[] args) {
		solutionExample testSolution = new solutionExample();
		List<List<String>> outputSolution = testSolution.groupAnagrams(new String[]{"tea","and","ate","eat","den"});
	}
}
