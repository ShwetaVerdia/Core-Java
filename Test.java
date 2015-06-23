import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		int s1, s2, s3;
		System.out.println("Enter three test scores");
		Scanner inp = new Scanner(System.in);
		s1= inp.nextInt();
		s2 = inp.nextInt();
		s3 = inp.nextInt();
		double area = (s1+s2+s3)/3;
		System.out.printf("Area is %f",area);
		
		
	}
}
