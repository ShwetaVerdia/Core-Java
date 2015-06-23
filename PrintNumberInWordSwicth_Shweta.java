import java.util.Scanner;


public class PrintNumberInWordSwicth_Shweta {
	public static void main(String[] args) {
		int num;
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = sc.nextInt();
		
		switch(num){
			case 1: word = "One"; break;
			case 2: word = "Two"; break;
			case 3: word = "Three"; break;
			case 4: word = "Four"; break;
			case 5: word = "Five"; break;
			case 6: word = "Six"; break;
			case 7: word = "Seven"; break;
			case 8: word = "Eight"; break;
			case 9: word = "Nine"; break;
			default: word ="Other"; break;

		}
		System.out.println(word);
	}

}
