package LeetCode242;

// Given two strings s and t, write a function to determine if t is an anagram of s.

// For example,
// s = "anagram", t = "nagaram", return true.
// s = "rat", t = "car", return false.

// Note:
// You may assume the string contains only lowercase alphabets.

// Follow up:
// What if the inputs contain unicode characters? How would you adapt your solution to such case?
// Hash table 鈥� O(n) time, O(1) space

import java.util.*;
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()) {
            return false;
        }

        int[] counter = new int[26];
        for (int i = 0; i< s.length(); i++) {
            counter[s.charAt(i) -'a'] ++;
            counter[t.charAt(i) -'a'] --;
        }

        for (int i = 0 ;i< 26; i++){
            if (counter[i] != 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
    	Solution testSolution = new Solution();
        boolean tt = testSolution.isAnagram("assd","dbac");
        System.out.println(tt);
    }
}