public class Clothing {
	//int a;

	Clothing(int a) {
		// this.a =a;
		System.out.println("This is superclass Constructor " + a);
	}

	void Calculate() {
		int a = 3;
		int b = 4;
		int t = a + b;
		System.out.println("The Total is " + t);

	}

	public static void main(String[] args) {
		Clothing c = new Clothing(29);
		Tshirt Ts = new Tshirt("shweta");
		c.Calculate();

	}

}

class Tshirt extends Clothing {
	String s;
	//int c;

	Tshirt(String s) {
		super(34);
		System.out.println("This is sub class constructor " + s);
	}

}