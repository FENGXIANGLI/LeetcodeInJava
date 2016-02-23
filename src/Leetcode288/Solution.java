package Leetcode288;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Setƒ¨»œ»•÷ÿ 

public class Solution {
	private final Map<String, Boolean> finalMap = new HashMap<>();
	private Set<String> dict;
	public Solution(String[] dictionary) {
		dict = new HashSet<>(Arrays.asList(dictionary));
		for (String string : dictionary) {
			String outputString = transferString(string);
			finalMap.put(outputString, !finalMap.containsKey(outputString));
		}
	}

	public boolean isUnique(String word) {
		String outputString = transferString(word);
		return !finalMap.containsKey(outputString)|| (finalMap.get(outputString)  && dict.contains(word));
	}

	public String transferString(String string) {
		int len = string.length();
		if (len <= 2  ) {
			return string;
		}
		return string.charAt(0) + Integer.toString(len -2 ) + string.charAt(len - 1);
	}
	
	public static void main(String[] args) {
		Solution testSolution = new Solution(new String[]{"hello","hello"});
		System.out.println(testSolution.isUnique("hello"));
	}
}


//Your ValidWordAbbr object will be instantiated and called as such:
//ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
//vwa.isUnique("Word");
//vwa.isUnique("anotherWord");