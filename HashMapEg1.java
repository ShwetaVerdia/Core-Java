package classworkitujava;

import java.util.HashMap;

public class HashMapEg1 {
	public static void main(String[] args) {
		String[] data = new String("Nothing is as easy as it looks").split(" ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String key : data)
		{
			Integer freq = hm.get(key);
			if(freq == null) freq = 1; else freq ++;
			hm.put(key, freq);
		}
		System.out.println(hm);
	}

}
