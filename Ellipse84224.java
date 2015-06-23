import java.util.Scanner;

/**
 * Java program to calculate focus, area and circumference of an ellipse using math class.
 * Input values to be entered by user on command line.
 * Homework 2
 * 
 * @author ShwetaVerdia Student ID 84224
 * 
 */

public class Ellipse84224 {

	public static void main(String[] args) {
		// Declaring local variables of type double to calculate area, focus and circumference
		double a, b, focus, circumference, area;
		System.out.println("This program calculates the focus, area, and circumference of an ellipse.");
		
		//Creating object of Scanner class to get input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The semi-major axis number must be larger than the semi-minor axis number.");
		
		//Prompting user to enter values of semi-major axis
		System.out.println("Enter the value for the semi major axis: ");
		
		//Initializing variable a by storing the value of semi- major axis
		a = sc.nextDouble();
		
		//Prompting user to enter values of semi-minor axis
		System.out.println("Enter the value for the semi minor axis: ");
		
		//Initializing variable b by storing the value of semi- minor axis
		b = sc.nextDouble();
		
		//Calculating focus of ellipse using math class function and printing its value
		focus = Math.sqrt(Math.pow(a,2) - Math.pow(b,2));
		System.out.printf("Focus is %.2f\n", focus);
		
		//Calculating area of ellipse using math class function and printing its value
		area = Math.PI * (a * b);
		System.out.printf("Area is %.2f\n", area);
		
		//Calculating circumference of ellipse using math class function and printing its value
		circumference = Math.PI* ((3 * (a + b)) - (Math.sqrt((10 * a * b)+ (3 * (a * a + b * b)))));
		System.out.printf("Circumference is %.2f\n", circumference);
	}

}