package classworkitujava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int orgNum =num;
		
		System.out.print("The reverse number of " + num + " is ");
		int rev_num = 0;
		while (num != 0) {
			rev_num = rev_num * 10;
			rev_num = rev_num + num % 10;
			num = num / 10;
		}
			System.out.println( rev_num );
			
			if(rev_num==orgNum){
				System.out.println("Given number is Plaindrome");
			}
				else
					System.out.println("Not a Palindrome");
					
			}

		}
		

	

