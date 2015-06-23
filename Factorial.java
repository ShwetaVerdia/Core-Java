public class Factorial {
	int fact = 1;

	public int facto(int n) {

		int i;
		for (i = n; i >= 1; i--) {
			fact = fact * i;

		}

		return fact;
	}

	public static void main(String args[]) {
		Factorial fa = new Factorial();

		System.out.println("Factorial is " + fa.facto(5));

	}
}
