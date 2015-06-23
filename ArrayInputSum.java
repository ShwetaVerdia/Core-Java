import java.util.Scanner;


public class ArrayInputSum {
	
	public static void main(String[] args) {
		int []arr = new int[6];
		int sum=0, mul=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of Array");
		for(int i=0;i<=arr.length-1;i++){
			arr[i]= sc.nextInt();
			sum = sum +arr[i];
			mul = mul*arr[i];
			}
			System.out.println("The sum of array is "+sum);
			System.out.println("The multiplication of array is "+mul);
		
		
	}

}
