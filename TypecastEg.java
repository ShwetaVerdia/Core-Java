class Machine {
	public void start() {
		System.out.println("Machine starts");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera starts");
	}

	public void snap() {
		System.out.println("Takes Picture");
	}
}

public class TypecastEg {
	public static void main(String[] args) {
		Machine m1 = new Machine();
		Camera c1 = new Camera();
		m1.start();
		c1.start();
		c1.snap();
//upcasting
		Machine m2 = c1;
		m2.start();
		
		//Downcating
		Machine m3 =new Camera();
		Camera c2 = (Camera) m3;
		c2.start();
		c2.snap();
		

	}

}
