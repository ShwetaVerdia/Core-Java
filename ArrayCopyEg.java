public class ArrayCopyEg {

	public static void main(String[] args) {
		int[] even = { 9, 13, 21, 4, 11, 7, 1, 3 };
		int[] rev = new int[8];
		System.arraycopy(even, 4, rev, 0, 4);
		System.arraycopy(even, 0, rev, 4, 4);
		/*
		 * System.out.println(reverse[0]); System.out.println(reverse[1]);
		 * System.out.println(reverse[2]); System.out.println(reverse[3]);
		 * System.out.println(reverse[4]); System.out.println(reverse[5]);
		 * System.out.println(reverse[6]); System.out.println(reverse[7]);
		 */
		System.out.printf("%2d,%2d,%2d,%2d,%2d, %2d, %2d,%2d", rev[0], rev[1],
				rev[2], rev[3], rev[4], rev[5], rev[6], rev[7]);
	}

}
