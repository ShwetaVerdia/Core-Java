package classworkitujava;


public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("The Prime numbers are:");
		for (int number = 2; number < 100; number++) {
			boolean isPrime = true;
			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(number);

		}

	}

}
