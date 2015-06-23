import java.util.Scanner;

public class PalindromeWord {
	String original = "", reverse = "";
	
	void palindromWord(){
		String original1 = original.toLowerCase();
		
		for (int i = original1.length() - 1; i >= 0; i--) {
			reverse = reverse + original1.charAt(i);
		}
	
		if (original1.equals(reverse)) {
			System.out.println(original + " is a Palindrome Word");
		} 
		else {
			System.out.println(original + " is not Palindrome Word");
		}
	}

	public static void main(String[] args) {
		PalindromeWord pw = new PalindromeWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		pw.original = sc.nextLine();
		
		if(isNumeric(pw.original)){
			System.out.println("Number is not allowed");
		} else{
		pw.palindromWord();
		}
	}
	
	
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}

}
