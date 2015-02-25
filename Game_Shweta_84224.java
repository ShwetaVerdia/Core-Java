package classworkitujava;

import java.util.Random;
import java.util.Scanner;

public class Game_Shweta_84224 {
	public static void main(String[] args) {
		int total = 0;
		int win = 0;
		int loss = 0;
		int secretNum;
		int count;

		System.out.println("Welcome to the number guessing game.");
		System.out.println("For each game, you have at most 3 chances to guess a secret number from 1 to 10.");
		System.out.println("Enter a number from 1 to 10;enter -1 to stop the game.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Random rg = new Random();
		mainwhileloop: while (input != -1) {
			secretNum = rg.nextInt(10) + 1;
			for (int i = 2; i >= 0; i--) {
				if (input == -1) {
					break mainwhileloop;
				} 
				else if (input == secretNum) {
					win++;
					System.out.println("Congratulations, correct!Lets start a new game");
					break mainwhileloop;
				} 
				else {
					System.out.println("Not Correct, try again");
					loss++;
					if(i==0){
						System.out.println("Not correct.You have reached your third trail. The correct number is " + secretNum );
						break;
					}
					
					//input=sc.nextInt();
				}
			}

		}

	}

}
