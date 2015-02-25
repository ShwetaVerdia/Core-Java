package classworkitujava;

import java.util.Scanner;

public class CreditCardCheckShweta84224 {

	public static int sumOfEvenPlace(char[] even) {
		int sumEven = 0;
		int doubleEven = 0;
		int[] arrayEven = new int[even.length];
		for (int i = 0; i < even.length; i++) {
			arrayEven[i] = Character.getNumericValue(even[i]);
			if (i % 2 == 0) {
				doubleEven = arrayEven[i] * 2;

				if (doubleEven >= 10 && doubleEven <= 99) {
					doubleEven = (doubleEven % 10) + (doubleEven / 10);
				}
				sumEven = sumEven + doubleEven;
			}
		}
		return sumEven;
	}

	public static int sumOfOddPlace(char[] odd) {
		int sumOdd = 0;
		int[] arrayOdd = new int[odd.length];
		for (int i = 0; i < odd.length; i++) {
			arrayOdd[i] = Character.getNumericValue(odd[i]);
			if (i % 2 != 0)
			sumOdd = sumOdd + arrayOdd[i];
		}
		return sumOdd;

	}

	public static int getTotalOddEven(int sumEven, int sumOdd) {
		int total = 0;
		total = sumEven + sumOdd;
		return total;

	}

	public static boolean isValid(int total) {
		if (total % 10 == 0)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		String creditCardNo;
		int sumEven;
		int sumOdd;
		int totalOddEven;
		boolean valid;
		String cType = null;

		System.out.println("Please enter the credit card number");
		Scanner sc = new Scanner(System.in);
		creditCardNo = sc.next();
		char[] cardNo = creditCardNo.toCharArray();
		if ((!creditCardNo.matches("[0-9]+")) || creditCardNo.length() < 13
				|| creditCardNo.length() > 16) {
			System.out
					.println("Invalid Card Number\n Credit card number must be between 13 and 16 digits");
		} else {

			switch (cardNo[0]) {
			case '4':
				cType = "Visa Card";
				break;
			case '5':
				cType = "Master Card";
				break;
			case '6':
				cType = "Discover Card";
				break;
			case '3':
				if (cardNo[1] == '7')
					cType = "American Express";
				break;

			}

			sumEven = sumOfEvenPlace(cardNo);
			sumOdd = sumOfOddPlace(cardNo);
			totalOddEven = getTotalOddEven(sumEven, sumOdd);
			valid = isValid(totalOddEven);
			if (valid) {
				System.out.println(creditCardNo + " is valid " + cType);
			} else
				System.out.println(creditCardNo + " is Invalid Card");

		}
	}
}
