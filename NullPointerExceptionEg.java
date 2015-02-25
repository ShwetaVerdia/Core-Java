package classworkitujava;

public class NullPointerExceptionEg {
public static void main(String[] args) {
	int i=8;
	try{
		i=i/0;
	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println(e);         
	}

}
}

