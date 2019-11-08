package longestPalindrome;

public class Main {
	public static void main(String[] args) {
		String input = "abccccdd";
		
		System.out.println("Input: " + input);
		
		FindLongestPalindromeLengthFunction solution = new FindLongestPalindromeLengthFunction();
		
		System.out.println("Solution: " + solution.longestPalindrome(input));
	}
}
