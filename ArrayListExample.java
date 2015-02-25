package classworkitujava;
import java.util.*;


public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<String>();
		
		list.add("Shweta");
		list.add("Vinay");
		list.add("Ankur");
		list.add("Mital");
		System.out.println("The ArrayList contain list of following name \n" +list);
		
		list.add(2,"Ashini");
		System.out.println("New Arraylist\n" +list);
		
		list.remove(2);
		System.out.println("Modified Array list is \n" +list);
		
		int pos = list.indexOf("Shweta");
		System.out.println("Index of Shweta in list is " +pos);
		
		int size = list.size();
		System.out.println("Size of current ArrayList is " +size);
		
		
		String item = list.get(1);
		System.out.println("Element at first index position is " +item);
		
		list.set(2, "Ashini");
		System.out.println("New Arraylist is " +list);
		
		//converting ArrayList into Array using toArray method of java.util.ArrayList
		String [] names = list.toArray(new String[list.size()]);
		
		//Printing elements of array by using toString method
		System.out.println(Arrays.toString(names));
		System.out.println("Printing all elements of array using for each loop :");
		for(String element: names){
			System.out.println(element);
		}
		
		
		
		//converting Arrays into Arraylist
		ArrayList<String> newlist = new ArrayList<String>();
		for(int i=0; i<=names.length-1;i++){
			newlist.add(names[i]);
			
		}
		System.out.println("Converted ArrayList is " +newlist);
		
	}

}
