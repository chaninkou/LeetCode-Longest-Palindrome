package longestPalindrome;

public class FindLongestPalindromeLengthFunction {
	// O(n) not the fastest
	// public int longestPalindrome(String s) {
	// HashSet<Character> set = new HashSet<>();

	// int count = 0;

	// for(int i = 0; i < s.length(); i++){
	// if(set.contains(s.charAt(i))){
	// set.remove(s.charAt(i));
	// count++;
	// } else {
	// set.add(s.charAt(i));
	// }
	// }

	// if(!set.isEmpty()){
	// return count * 2 + 1;
	// }

	// return count * 2;
	// }
	
	// Solution using array instead of hashset
	public int longestPalindrome(String s) {
		// 128 since there is only that amount of character from a-z and A-Z
		int[] char_counts = new int[128];

		// Keep track of how many times a character appear
		for (char c : s.toCharArray()) {
			char_counts[c]++;
		}

		int result = 0;

		// Go through 128 int
		for (int char_count : char_counts) {
			// Add it to the result
			result += char_count / 2 * 2;
			
			// If the result is even and current is odd, then we just add one
			if (result % 2 == 0 && char_count % 2 == 1) {
				result += 1;
			}
		}

		return result;
	}
}
