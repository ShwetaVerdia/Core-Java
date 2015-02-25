package classworkitujava;

import java.util.HashSet;

/* 1.Java Program to find duplicate in String in Array and 
 * 2.then remove duplicates and print the array
 * 
 */

public class DuplicateInArray {
	public static void main(String[] args) {
		
		String [] strArr = {"abc", "def", "efg", "abc", "hij", "bca", "cab", "efg"};
		System.out.println("Length of Array is " + strArr.length);
		
		//1. Using Brute Force Method
		for(int i=0; i<strArr.length-1; i++){
			for(int j=i+1; j<=strArr.length-1;j++){
				if(strArr[i].equals(strArr[j]) && (i!=j)){
					System.out.println("Duplicate is of Array "+ strArr[i]);
				}
			}
		}
		
		//2. Using HashSet
		
		HashSet<String> set = new HashSet <String>();
		
		for(String arrElement:strArr){
			// Print the elements which are not added by set as they were duplicates
			if(!set.add(arrElement)){ 
				System.out.println("Duplicate Element is " + arrElement );
			}
			
		}
		
		for(String s : set){
			System.out.print(s + "\t");
		}
		System.out.println("\n" + "Size of HashSet is " + set.size());

		
		
		
		
	}

}
