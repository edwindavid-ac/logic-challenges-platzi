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

		System.out.println("Enter the number: ");
		int num = user_input.nextInt();
		int max = 0, i = 0, n = 0, module = 0, count = 0;
		
		if (num <= 1 || num <= 2) {
			if (num == 2) {
				primes.addElement(2);
				System.out.println("Primes: " + primes);
			}
			else {
				System.out.println("The number: " + num + " is not prime");
			}
		}
		else {
			primes.addElement(2);
			max = num;
			for (i = 3 ; i <= max ; i=i+2) {
				for (n = 1 ; n <= i ; n=n+1) {
					module = i%n; 
					if (module == 0) {
						count++;
					}
				}
				if (count == 2) {
					primes.addElement(i);
					count = 0;
				}
				else {
					count = 0;
				}
			}
			System.out.println("Primes: " + primes);
		}
	}
}

