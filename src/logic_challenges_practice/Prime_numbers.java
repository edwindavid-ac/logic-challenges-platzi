package logic_challenges_practice;
import java.util.*;

public class Prime_numbers {

	public static void main(String[] args) {
		/*
		 * You are given a positive number greater than zero as input. Your task is to return an array containing all prime numbers 
		 * less than or equal to the input number, sorted in ascending order.
		 * 
		 * Heads up! A prime number is a number that is only divisible by 1 and itself.
		 * 
		 * Note:
		 * All prime numbers are odd, except for 2.
		 * The number 1 is not prime because it does not meet the two conditions mentioned above.
		 * 
		 * Example:
		 * solution(5);
		 * Output => [2, 3, 5]
		 */
		
		Vector<Integer> v = new Vector<Integer>();
		
		for (int i = 0 ; i < 6 ; i++) {
			v.addElement(i);
		}
		
		System.out.println(v);
		System.out.println(v.get(2));
	}

}
