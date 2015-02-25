package classworkitujava;

public class Circle implements Comparable<Circle> {
	double radius;

	public static void main(String[] args) {

	}

	Circle(double radius) {
		this.radius = radius;

	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public int compareTo(Circle c) {

		if (this.getArea() < ((Circle) (c)).getArea()) {
			return -1;
		} else if (this.getArea() > ((Circle) (c)).getArea()) {
			return 1;
		}

		else
			return 0;

	}
}





