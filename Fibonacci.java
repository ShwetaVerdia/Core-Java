package classworkitujava;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter the Number of inputs");
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int f1, f2 =0;
		int f3 =1;
		for(int i=1; i<=in; i++){
			System.out.print(f3 + " " );
			f1=f2;
			f2=f3;
			f3 =f1+f2;
		}
		
	}

}
