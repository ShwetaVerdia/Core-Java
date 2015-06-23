import java.util.Scanner;

/*
 * Java Program to compare strings that prompt user to enter two string input and printing them in ascending order
 * @author Shweta Verdia Student ID 84224
 */

public class Comparison84224 {
	public static void main(String[] args) {
		// Declared s1 and s2 as a String variable
		String s1 = "";
		String s2 = "";

		// Creating object of Scanner class to get input from command line
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String s1");
		s1 = sc.nextLine();

		System.out.println("Enter the String s2");
		s2 = sc.nextLine();

		System.out.println("The String in ascending order is");

		// used if statement for comparison and printing the values

		if (s1.compareTo(s2) < 0) {
			System.out.println(s1 + "\n" + s2);
		}

		else {
			System.out.println(s2 + "\n" + s1);
		}

	}

}
