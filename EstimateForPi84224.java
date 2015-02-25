package classworkitujava;

import java.lang.Math;

/* Java Program to compute the value of PI upto 11decimal places using static method
 * @author Shweta Verdia Student ID 84224
 * 
 */

public class EstimateForPi84224 {
	//Estimate method to compute value of pi by taking loopCount as parameter
	public static double estimate(int loopCount) {

		double result;//result will Store result
		double term = 0;// store the term values
		int sign = 1; // for changing plus and minus signs
		double firstValue = Math.sqrt(12);// 

		for (int i = 0, j = 1; i <= loopCount; i++, j += 2) {
			double demo = j * Math.pow(3, i);
			term = term + (1 * sign / demo);
			sign = sign * -1;

		}
		result = firstValue * term;
		return result;

	}

	public static void main(String[] args) {

		System.out.printf("The PI value approximation is %.11f \n",estimate(21));
		System.out.println("The PI constant in Java Math class is " + Math.PI);

	}

}
