package leetcode409;

import java.util.HashSet;

public class FindLongestPalindromeLengthFunction {
	// O(n) not the fastest
	 public int longestPalindrome(String s) {
		 // Having a set to keep track of characters
		 HashSet<Character> set = new HashSet<>();
		 int result = 0;
		 
		 // For each character in String
		 for(char c : s.toCharArray()){
			 // If it contains the current char, remove the value of set and plus 2 to the result
			 if(set.contains(c)){
				 set.remove(c);
				 result += 2;
			 } else {
				 // Add it to the set
				 set.add(c);
			 }
		 }
		 
		 // In case set is not empty, that means add one to the set
		 if(!set.isEmpty()){
			 return result + 1;
		 }
		 
		 return result;
	 }
	
	// Solution using array instead of hashset
//	public int longestPalindrome(String s) {
//		// 128 since there is only that amount of character from a-z and A-Z
//		int[] char_counts = new int[128];
//
//		// Keep track of how many times a character appear
//		for (char c : s.toCharArray()) {
//			char_counts[c]++;
//		}
//
//		int result = 0;
//
//		// Go through 128 int
//		for (int char_count : char_counts) {
//			// Add it to the result
//			result += char_count / 2 * 2;
//			
//			// If the result is even and current is odd, then we just add one
//			if (result % 2 == 0 && char_count % 2 == 1) {
//				result += 1;
//			}
//		}
//
//		return result;
//	}
}
