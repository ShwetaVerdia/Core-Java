package classworkitujava;
import java.util.*;


public class ArrayListCompareToDemo {
	
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Shweta");
		arraylist.add("Vinay"); 
		arraylist.add("Ankit");
		System.out.println(arraylist);
		Collections.sort(arraylist);
		System.out.println();
		System.out.println("Sorted Arraylist is as follows:");
		System.out.println(arraylist);
	}

}
