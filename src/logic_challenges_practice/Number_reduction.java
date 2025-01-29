package logic_challenges_practice;
import java.util.*;

public class Number_reduction {

	public static void main(String[] args) {
		/*
		 * In this challenge, you will receive a number that you must reduce to 1 in the fewest 
		 * possible steps by applying the following operations:
		 * 
		 * If the number is even, you can divide it by 2.
		 * If the number is odd, you can either add 1 or subtract 1. (n + 1) or (n - 1).
		 * 
		 * For example:
		 * Number = 15
		 * Steps = 5
		 */
		
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int num = user_input.nextInt();
		int steps = 0;
		
		while(num > 1) {
			if (num%2 == 0) {
				num = num/2;
			}
			else {
				if (num%4 == 3 && num > 3) {
					num = num + 1;
				}
				else {
					num = num - 1;
				}
			}
			steps = steps + 1;
		}
		System.out.println("Reduction: " + num + " - Steps: " + steps);
	}
}
