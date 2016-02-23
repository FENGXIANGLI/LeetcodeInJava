package LeetCode242;

import java.util.HashMap;
import java.util.Map;

public class SolutionTwo {
	private Map<Character, Integer> storeMap = new HashMap<>();
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int n = s.length();
		
		int[] counter = new int[26];
		
		for (int i = 0; i < n; i++) {
			counter[s.charAt(i) - 'a'] ++ ;
			counter[t.charAt(i) - 'a'] -- ; 
		}
		for (int i : counter) {
			
		}
		
		
		return true;
	}
}
