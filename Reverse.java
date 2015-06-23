import java.util.Scanner;


public class Reverse {

	public static void main(String args[]) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		original = sc.nextLine();
		int len = original.length();
		System.out.println("Length of the original String is " + len);
		
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
			System.out.println("Reverse of String is " + reverse);
		}

	}

