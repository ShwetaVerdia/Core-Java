package classworkitujava;



/**
 * Created by mitalcs on 12/6/14.
 */
class A{

    //Static Block
    static{
        System.out.println ("Static Block of A");
    }

    //Non-Static Block
    {
        System.out.println ("Non - Static Block of A");
    }

    //Static Block
    static{
        System.out.println ("Another static block of A");
    }

    //Non-Static Block;
    {
        System.out.println ("Another non - static block of A");
    }

    //constructor of A
    A(){
        System.out.println ("Constructor A is printing");
    }
}
class B extends A{
    //non - static block
    {
        System.out.println ("Non static Block of B");
    }

    //static block
    static {
        System.out.println ("Static Block of B");
    }

    //Non-Static Block;
    {
        System.out.println ("Another non - static block of B");
    }

    //static block
    static {
        System.out.println ("Another Static Block of B");
    }

    //Constructor of B
    B(){
        System.out.println ("Constructor B is printing");
    }
}

public class Test {
    public static void main (String[] args){
        new B();

        // Static Block of A
        //Another Static Block of A
        // Static Block of B
        //Another Static Block of B
        //Non Static Block of A
        //Another Non Static Block of A
        // Constructor A is printing
        //Non Static Block of B
        //Another Non Static Block of B
        //Constructor of B is printing.
    }
}