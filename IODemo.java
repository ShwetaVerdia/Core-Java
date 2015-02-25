package classworkitujava;

import java.io.*;
import java.util.*;

public class IODemo {
	public static void main(String[] args) {
		

	File inFile = new File("data.txt"); // input data in
	File outFile = new File("dataout.txt");
	
	try {
	Scanner in= new Scanner(inFile);
	System.out.println("File is found");
	PrintWriter pw = new PrintWriter(outFile);
	System.out.println("Ouutput File is created");
	
	//String line = in.next();
	}
	
	catch (IOException ex) {
		System.out.println("File data.txt not found");
		
	}
	

}
}