
public class Triangle {
public static void main(String args[]){
	int a=0;
	int b=0;
	int c=0;
	if(a==b)
	{
		if(a==c)
	System.out.println("Triangle is equilateral");
		else
		System.out.println("Triangle is isoceles");
	}
	else if(a!=b && a!=c && a+b>c)
		System.out.println("not a triangle");
	
	System.out.println("Triangle is scalene");
	}
}
