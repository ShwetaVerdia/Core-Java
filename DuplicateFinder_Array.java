package classworkitujava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class DuplicateFinder_Array {

	public static void main(String[] args) {
		int[] arrElement = { 10, 20, 30, 10, 30, 40, 56, 87, 34, 14, 12, 12, 56 };
		int max =0;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		for (int key : arrElement) {
			Integer count = hashMap.get(key);// get method returns the value
												// associated with that key

			if (count == null)
				count = 1;
			else
				count++;

			hashMap.put(key, count);
		}
		// Finding Duplicates in an Array	
		System.out.println("Dupliacte Elements of Array: ");
		for (int dupElements : hashMap.keySet())
		{
			if (hashMap.get(dupElements) > 1) 
			{
				System.out.print(dupElements + "\t");
			}

		}
		
		// Finding maximum number in an Array
		
		for(int item: hashMap.keySet())
		{
			if(item>max)
				max=item;
		}
		System.out.println(" ");
		System.out.println("Largest Element of Array is " + max);
		

		System.out.println();
		System.out.println("Frequency count of elements of Array is:");
		System.out.printf("%-10s %10s", "Element", "Count\n");
		for (int key : hashMap.keySet()) {

			int count = hashMap.get(key);
			System.out.printf("%-10s %5s\n", key, count);

		}

		/*
		 * // Printing only Duplicate Values of an Array HashSet
		 * duplicateElements = new HashSet();
		 * System.out.println("Duplicate Elements of Array are:");
		 * 
		 * for (int key : arrElement) {
		 * 
		 * if (!duplicateElements.add(key)) { System.out.print(key + "\t"); }
		 * 
		 * }
		 */

	}

}
