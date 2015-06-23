
public class Animal {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal h = new Horse();
		a.eat();
		h.eat();
	}
	public void eat() {
		System.out.println(" Generic Animals Eating generically");
	}
}

class Horse extends Animal {
	public void eat(){
		System.out.println(" Horse eats grass");
	}
}