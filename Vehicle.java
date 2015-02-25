package classworkitujava;

public class Vehicle {

	String name;
	Vehicle nissan;
	ElectricCar ec;
	

	Vehicle() {
		name = "Vehicle";
	}

	public void run() {
		System.out.println(name + " runs");
		
	}

	public static void main(String[] args) {
		Vehicle cc = new Vehicle();
		Vehicle b = new Bus();
		ElectricCar car = new ElectricCar();
		cc.testObjects(cc);
	}

	void testObjects(Vehicle xyz) {
		if(xyz instanceof ElectricCar){
		ec = (ElectricCar)xyz;
		System.out.println("Casting possible");
		}
		System.out.println("Casting not possible");
	}

}

class ElectricCar extends Vehicle {
	String name;

	ElectricCar() {
		this.name = "Nissan Leaf";
	}

}

class Bus extends Vehicle {
	Bus() {
		name = "RoadBus";
	}

}
