package classworkitujava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @Description: Program that prompts the user to enter the first 9 digits and displays the 10 digit ISBN
 * @author: ankujindal
 */

import java.util.Scanner;

public class BookIsbn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String isbn;
        char cs;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter 9 digits for the ISBN code");
        isbn = in.next();
        if ((!isbn.matches("[0-9]+")) || (isbn.length() != 9))
               System.out.println("Invalid ISBN");
        else
        {
           cs= getCheckSum(isbn);
           isbn+= cs;
           System.out.println("The complete isbn code is:" +isbn);
        }
    }
    
        public static char getCheckSum(String isbn)
        {
        char[] D = new char[10];
        int[] isbnComplete = new int[10];
        int x=0;
        char cs;
        for(int i=0;i<isbn.length();i++)
            {
            D[i]=isbn.charAt(i);
            isbnComplete[i]=Character.getNumericValue(D[i]);
            x=x+(isbnComplete[i]*(i+1));
            }
            x = x%11;
            
            if(x==10)
                cs = 'x';
            else
            cs = (char)('0' + x);
            
        return cs;
            
        }
}
