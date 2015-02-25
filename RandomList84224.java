package classworkitujava;
/**This java program prints random numbers between the upper limit specified by the user
 * @author Shweta Verdia
 */

import java.util.Random;
import java.util.Scanner;

public class RandomList84224 {
	public static void main(String[] args) {
		int n;
		int max = 1;
		int min = 1000;
		System.out.print("Create Random Number");
		System.out.print("\nEnter the upper limit : ");
		Scanner sc = new Scanner(System.in);//Creating Scanner class object 
		int limit = sc.nextInt();
		System.out.print("Enter the count of the numbers :");
		int count = sc.nextInt();
		Random rg = new Random();//Creating Random class object 
		System.out.println("Random Numbers are:");

		for (int i = 1; i <= count; i++) {
			n = rg.nextInt(limit);//Storing random values in n
			System.out.printf("%10d", n);

			if (i % 15 == 0) {
				System.out.println();
			}

			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;

			}

		}
		System.out.println();
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);

	}

}
