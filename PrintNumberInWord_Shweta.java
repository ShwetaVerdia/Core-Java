import java.util.Scanner;

public class PrintNumberInWord_Shweta {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		num = sc.nextInt();

		if (num==9) {
			System.out.println("Nine");
		}
		else if (num==8) {
			System.out.println("Eight");
		} else if (num==7) {
			System.out.println("Seven");
		} else if (num==6) {
			System.out.println("Six");
		} else if (num==5) {
			System.out.println("Five");
		} else if (num==4) {
			System.out.println("Four");
		} else if (num==3) {
			System.out.println("Three");
		} else if (num==2) {
			System.out.println("Two");
		} else if (num==1) {
			System.out.println("One");
		} else {
			System.out.println("Other");
		}

	}

}
