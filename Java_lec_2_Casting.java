public class Java_lec_2_Casting {
	public static void main(String args[]) {
		float a = 9.3f, b = 4.3f;
	//	double res = a * 1.0 / b; /*Multiply either a or b by a double to get double in result or do casting
		/**by double res = (double)a/b;  and also cast either a or b, do not cast the result of(a/b)
		**/
		//System.out.println("The res is  " + res);
		
		int f= (int)(a/b);
		float i = a/b;
		System.out.println("The result is " +f);
		System.out.printf("Float is %.3f", i);
 

	}
}
