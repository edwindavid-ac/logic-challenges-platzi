package logic_challenges_practice;
import java.util.*;

public class Numeric_operations {

	public static void main(String[] args) {
		/*
		 * What is the mathematical procedure in the following operations?
		 * 5 + 4 = 19
		 * 8 + 2 = 610
		 * 10 + 8 = 218
		 * 12 + 9 = 321
		 * 18 + 2 = 1620
		 * 21 + 5 = 1626
		 */
		 Scanner user_input = new Scanner(System.in);
		 System.out.println("Enter the first number: \n");
		 int input1 = user_input.nextInt();
		 System.out.println("Enter the second numer: \n");
		 int input2 = user_input.nextInt();
		 
		 int ops1 = input1 - input2;
		 int ops2 = input1 + input2;
		 
		 System.out.println("The final number is: " + ops1 + ops2);
         
		 //For further practice lets create a function for this problem
	}

}
