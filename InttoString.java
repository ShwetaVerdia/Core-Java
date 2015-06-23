
public class InttoString {
	public static void main(String[] args) {
		int i =10;
		Integer intObj = new Integer (i); // created wrapper object of Int primitive data type
		String str = intObj.toString(); // Converting Wrapper Object into String
		System.out.println("Integer converted to String is " + str);
		System.out.println(intObj);
	}

}
