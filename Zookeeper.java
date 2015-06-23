class Mammal {
	 String name = " Furry";

	 String makeNoise() {
		return "generic noise";
	}
}

class Zebra extends Mammal {
	 String name = " stripes";

	 String makeNoise() {
		return "bray";
	}
}

public class Zookeeper {
	public static void main(String[] args) {
		new Zookeeper().go();
	}

	void go() {
		Mammal m = new Zebra();
		Zebra z = new Zebra();
		Mammal m1 = new Mammal();
		System.out.println(m.name  +  m.makeNoise()+z.name +z.makeNoise()+m1.name  + m1.makeNoise());

	}
}
