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
		
		Scanner user_input = new Scanner(System.in);
		Vector<Integer> primes = new Vector<Integer>();
		
		primes.addElement(2);
		System.out.println("Enter the number: ");
		int num = user_input.nextInt();
		int com = 0;
		
		if (num == 1 || num < 1) {
			System.out.println("The number " + num + " is not prime");
		}
		else if (num == 2) {
			System.out.println("The primes are: " + primes);
		}
		else {
			for (int i = 3 ; i <= num ; i++) {
				for (int n = 2 ; i <= 9 ; i++) {
					if (i%n == 0) {com++;}
				}
				if (com == 1) {primes.addElement(i);}
				com = 0;
			}
			System.out.println("The primes are: " + primes);
		}
	}
}

