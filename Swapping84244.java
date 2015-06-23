import java.util.Scanner;


public class Swapping84244 {
	public static void main(String[] args) {
		int a, b, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vale of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("The new value of a is " +a);
		System.out.println("the new value of b is "+b);
		
		
	}

}
