
public class Superclass {
public static void main(String[] args) {
	Subclass s1= new Subclass();
	s1.PrintMethod();	
}
	
}

class Super1{
public void PrintMethod()
{ System.out.println(" This is superclass method");
}
}

class Subclass extends Super1{
	public void PrintMethod(){
		super.PrintMethod();
		System.out.println(" This is subclass method");
	}
}