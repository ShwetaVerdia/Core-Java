package classworkitujava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateWordsEG {

	public static void main(String[] args) {
		String [] a = {"Shweta", "Vinay", "Ankur", "Shweta", "Vinay", "Surbhi", "Ankit", "Vijay", "Surbhi", "Ankit", "Riya", "Jeny", "Ankur", "Shweta"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(a));
		
	
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String key : al) {
			Integer freq = hm.get(key);
			if (freq == null) 
				freq = 1;
				
			else 
				freq++;
				hm.put(key, freq);
			
		}
		System.out.println("Map Contains:");
		System.out.printf("%-10s %10s", "key","Value\n");
		
		
		for (String entry : hm.keySet()) {

			String key = entry.toString();
			String value = hm.get(entry).toString();
			System.out.printf("%-10s %5s\n", key, value);
			
		}
		
		System.out.println();
		System.out.println("Set Contains:");
		Set<String> set = hm.keySet();
		TreeSet <String> sortedKeys = new TreeSet<String> (set);
		for(String ts: sortedKeys){ 	
			System.out.printf("%-10s %5s\n",ts, hm.get(ts));
		}


	}

}
