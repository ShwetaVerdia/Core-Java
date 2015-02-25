package classworkitujava;

public class Try_Catch_Eg {
	public static void main(String[] args) {
		int y=0;
		try{
			int x= (5/y);
			System.out.println(x);
			
		}
		
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println("Divide by Zero Exception");
		}
	}

}
