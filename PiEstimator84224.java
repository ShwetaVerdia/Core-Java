package classworkitujava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This Java program estimates the PI value and displays it using count N
 * 
 * @author shweta Verdia 84224 Mid Term exam fall 2014
 * 
 */

public class PiEstimator84224 {

	static ArrayList<Double> estimatePI(int count) {
		// result will Store Result
		ArrayList<Double> result = new ArrayList<Double>();
															
		double term = 0; // store the term values
		int sign = 1; // For changing plus and minus signs
		double firstValue = Math.sqrt(12);
		for (int i = 0, j = 1; i < count; i++, j += 2) {
			double demo = j * Math.pow(3, i);
			term = term + (1 * sign / demo);
			sign = sign * -1;
			result.add(firstValue * term);

		}

		return result;

	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a count N to estimate the value of PI  by looping for a series of calculation: ");
		int N = reader.nextInt();

		ArrayList<Double> res = estimatePI(N);

		System.out.println("\n The PI values are:  \n ");
		for (Double temp : res) {
			System.out.printf(" %.14f  \n", temp);
		}
		System.out.println();

		System.out.println("\n The PI constant in Java Math class is "
				+ Math.PI);

	}
}
