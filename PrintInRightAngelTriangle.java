

/**
 * Created by Mital Jani on 11/3/14.
 */
public class PrintInRightAngelTriangle {

    public void printName(String name) {
        String input = name;
        String newInput = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            newInput += c;
            System.out.println(newInput);
        }
        System.out.println ("Checking the new Input String now : " + newInput);
    }

    public void printSymbol(int number) {
        int n = number;
        String input = "";
        for (int i = 0; i < number; i++) {
            input += "*";
            System.out.println(input);
        }
        System.out.println ("Checking the input string now : " + input);
    }

    public static void main(String[] args) {
        PrintInRightAngelTriangle sd = new PrintInRightAngelTriangle();
        System.out.println("Printing Name in Triangle");
        sd.printName("Mital");
        System.out.println("\nPrinting Symbols in Triangle");
        sd.printSymbol(5);
        

    }


}

