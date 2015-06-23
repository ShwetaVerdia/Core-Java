/**
 * This program is used to show the use of constructor overloading.
 * @author javawithease
 */
public class ConstructorExample5 {
	int num;
	boolean isStudent;
	String str;
	
	//One argument constructor
	ConstructorExample5(boolean boolean1){
		System.out.println("One argument constructor called.");
		isStudent = boolean1;
	}
	
	//Two argument constructor
	ConstructorExample5(int n, String s){
		System.out.println("Two argument constructor called.");
		num = n;
		str = s;
	}
	
	//Three argument constructor
	ConstructorExample5(boolean boolean1, int n, String s){
		System.out.println("Three argument constructor called.");
		isStudent = boolean1;
		num = n;
		str = s;
	}
	public static void main(String args[]){
		//one argument constructor call
		ConstructorExample5 obj1 = new ConstructorExample5(true);
		//print values of object properties.
		System.out.println("isStudent = " + obj1.isStudent);
		System.out.println("num = " + obj1.num);
		System.out.println("str = " + obj1.str);
		
		//two argument constructor call
		ConstructorExample5 obj2 = new ConstructorExample5(10, "javawithease");
		//print values of object properties.
		System.out.println("isStudent = " + obj2.isStudent);
		System.out.println("num = " + obj2.num);
		System.out.println("str = " + obj2.str);
		
		//three argument constructor call
		ConstructorExample5 obj3 = new ConstructorExample5(false, 20, "javawithease.com");
		//print values of object properties.
		System.out.println("isStudent = " + obj3.isStudent);
		System.out.println("num = " + obj3.num);
		System.out.println("str = " + obj3.str);
	}
}
