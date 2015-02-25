package classworkitujava;

import java.io.File;
import java.io.FileInputStream;


public class Multiple_Catch {
	
		int [] array = new int[3];
		int n;
		
		public static void main(String[] args) throws InterruptedException {
			Multiple_Catch mc = new Multiple_Catch(0);
			Multiple_Catch mc1 = new Multiple_Catch(5);
			mc1=null;// NullPointer Exception example
			mc1.method();
			
		}
		public void method() throws InterruptedException{
			Thread.sleep(6000);
			System.out.println("hello i am here");
			
		}
		
		Multiple_Catch (int n){
			 try{
				 if (n==0)
					 System.out.println(5/n);
				 
				 else {
					 array[3] =n;
					 System.out.println(n);
				 }
			 }
		 
			
		 catch(ArrayIndexOutOfBoundsException arrayindex){
			 System.out.println(arrayindex);
			 arrayindex.printStackTrace();
		 }
		 catch(ArithmeticException ae){
			 ae.printStackTrace();
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 
	}
		//public void fileRead(){
			//FileInputStream fileInputStream = new FileInputStream(new File("Constants.properties"));
		
	}
		



