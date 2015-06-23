import java.util.Scanner;


public class StringCharacter {
	public static void main(String[] args) {
		String greeting = "Hello, World";
		int n = greeting.length();
		//int y = greeting.size();
		System.out.println(n);
		//System.out.println(y);
		
		//int luckyNo;
		//System.out.println(luckyNo);
		int sum =0;
		int f = 1;
		int x = 2;
		double avg = (f+x)/2;
		System.out.println(avg);
		f=+1;
		// to print backslash and double quotes
		System.out.println("\"Hello\"  \\Temp\\");
		for(int i=0; i<=10; i++){
		sum +=1;}
		System.out.println(sum);;
		// String and charAT examples
		String name ="Shweta";
		char first =name.charAt(0);
		char last = name.charAt(5);
		System.out.println(first);
		System.out.println(last);
		String sub = name.substring(1);
		System.out.println(sub);
		String str = name.substring(name.length()-1);
		System.out.println(str);
		Scanner cin = new Scanner(System.in);
		
		//Explicit Conversion Example
		System.out.println("Enter a whole number");
		String intString = cin.next();
		System.out.println(intString);
		// intString = 1 +intString;// will concatinate bcoz it is a String
		 //System.out.println(intString);
		
		//Convert the input string into integer
		int num = Integer.parseInt(intString);
		num = num+ 1;
		
		
		System.out.println(num);
		
		
		
		String letter = "o";
		String s = "hello";                      // These two String objects
		String t = "hello" ;              // contain exactly the same text. 
		String s1 = new String("hello");
		
		if (s == s1) 
			System.out.println("equal"); 
		else
			System.out.println("not equal");
		
		
		
	}

}
