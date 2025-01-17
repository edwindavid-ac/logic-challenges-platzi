package logic_challenges_practice;

public class Find_the_factor {

	public static void main(String[] args) {
		/*
		 * - Finding the factor of a list of desired outcomes -
		 * The numbers will go from 3 to 8 and given a numeric array
		 * with the results of the operation we need to find the factor 
		 * of the operation. For example:
		 *  3 * x =  27
		 *	4 * x =  36
		 *	5 * x =  45
		 *	6 * x =  54
		 *	7 * x =  63
		 *	8 * x =  72
		 * The factor is 9. 
		 * If just one factor is different a 'false' is returned.
		 */

		
		int[] outs = {12,16,20,24,28,32}; //Array of expected results (subject to change)
		int[] nums = {3,4,5,6,7,8}; //Multipliers 
		int i = 0;
		int factor;
		int ref_factor;
		boolean condition = true;
		
		ref_factor = outs[i]/nums[i];
		
		while (i < outs.length && condition == true) {
			
			factor = outs[i]/nums[i];
			
			if (factor != ref_factor) {
				condition = false;
			}
			i++;
		}
		
		if (condition == true) {
			System.out.println("The factor of the operation is: " + ref_factor);
		}
		else {
			System.out.println(condition);
		}
		
	}

}
