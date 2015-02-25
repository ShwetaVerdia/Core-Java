package classworkitujava;

public class ToStringEg {
public static void main(String[] args) {
	ToStringEg ts =new ToStringEg();
	System.out.println(ts);
	System.out.println(ts.toString());
	Dog d = new  Dog();
	d.testing(d);
}

}

class Dog extends ToStringEg {
	public  void testing(Dog d){
		System.out.println(d);
	}
}
