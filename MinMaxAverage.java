
import java.util.Scanner;

public class MinMaxAverage {

    public static void main(String args[]) {

        int sum = 0;
        int totalInputs = 0;

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        //Take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter -1 to stop.");
        System.out.print("\nEnter number " + (totalInputs + 1) + ": ");
        int input = sc.nextInt();

        while (input != -1) {
            if( input < -1 ){
                System.out.println("[Error] Input number can not be less than -1. Please try again.");
                System.out.print("Enter number " + (totalInputs + 1) + ": ");
                input = sc.nextInt();
                continue;
            }

            if( input == -1 ){
                break;
            }

            sum += input;
            totalInputs++;

            //Find Min and Max
            if (minimum > input) {
                minimum = input;
            }

            if (maximum < input) {
                maximum = input;
            }

            System.out.print("Enter number " + (totalInputs + 1) + ": ");
            input = sc.nextInt();
        }
        System.out.println("\nMinimum number is : " + minimum);
        System.out.println("Maximum number is : " + maximum);
        System.out.println("Average is : " + (double) sum / totalInputs);
    }
}