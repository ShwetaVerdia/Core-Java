
public class A {

	public static void main(String args[]) {
		B b = new B();
		b.setSize(34);
		b.getSize();
		// System.out.println(" The x is " + x);
	}
}

class B {
	int size;
	String color;
	String name;

	public void setSize(int i) {
		size = i;
	}

	int getSize() {
		System.out.println("The size is " + size);
		return size;
	}
}

