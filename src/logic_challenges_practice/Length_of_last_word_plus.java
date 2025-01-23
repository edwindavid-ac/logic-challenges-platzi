package logic_challenges_practice;

public class Length_of_last_word_plus {

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
		
		String s = "Edwin David";
		char[] s_new = s.toCharArray();
		int i = 0;
		int s_len = s.length()-1;
		int final_len = 0, pos = 0;
		
		for (i = s_len ; i >= 0 ;i--) {
			if(s_new[i] != ' ') {
				final_len+=1;
			}
			else {
				pos = i+1;
				i = 0;
			}
		}
		System.out.println("The last word is: " + s.substring(pos) + " and its length is: " + final_len);
	}
}
