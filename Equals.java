public class Equals {
	public static void main(String args[])

	{
		Integer i1 = 1000;
		Integer i2 = 1000;
		Integer i3 = new Integer(53);
		Integer i4 = i3;
		
		if(i1==i2)
		 System.out.println("Are not Same, not poitning to same object");
		else if(i1.equals(i2))
			System.out.println("Have same content");
		
		if(i3==i4)
			 System.out.println("Poitning to same object and their values are also same");
			else if(i3.equals(i4))
				System.out.println("Have same content");
	}


}
