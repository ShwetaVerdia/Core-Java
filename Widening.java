
public class Widening {
static void go(double x) 
{ System.out.println("byte  ");
}
public static void main(String[] args) {
	byte b =5;
	short s =10;
	long l = 15;
	float f = 4f;

	go(b);
	go(s);
	go(l);
	go(f);
	
}
}
