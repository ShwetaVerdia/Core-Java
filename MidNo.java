
public class MidNo {
	public static void main (String args[]) {
		int a=9;
		int b=10;
		int c=15;
		
		if(a>=b && a>=c)
		{
			if(b>=c)
				System.out.println("Mid Value is : "+b);
			else
				System.out.println("Mid Value is : "+c);
		}
	if(b>=c && b>=a){
		if(c>=a)
			System.out.println("Mid Value is : "+c);
		else
			System.out.println("Mid Value is: "+a);
	}
	if(c>=a && c>=b){
		if(a>=b)
			System.out.println("Mid value is "+a);
		else
			System.out.println("Mid Value is "+b);
	}
	}


}
