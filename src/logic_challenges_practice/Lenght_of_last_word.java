package logic_challenges_practice;

public class Lenght_of_last_word {

	public static void main(String[] args) {
		/*
		 * Given a string s consisting of words and spaces, return the length of the last word in the string.
		 * 
		 * A word is a maximal substring consisting of non-space characters only.
		 * 
		 * Example:
		 * Input: s = "luffy is still joyboy"
		 * Output: 6
		 * Explanation: The last word is "joyboy" with length 6.
		 */

		String s = "luffy is still joyboy";
		char blank = ' ';
		
		int begin = s.lastIndexOf(blank) + 1;
		int end = s.length();
		
		String s_new = s.substring(begin,end);
		
		int substring_l = s_new.length();
		
		System.out.println("The last word is: '" + s_new + "' with length: " + substring_l);
		
	}

}
