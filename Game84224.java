package classworkitujava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * This program implements number guessing from 1 to 10 and allows maximum of 3
 * attempts to make gues   s.
 * 
 * @author Shweta Verdia 
 */

public class Game84224 {

	/*
	 * @param This method take input from user
	 */
	public static void main(String[] args) {
		int number;
		int total = 0;
		int randomNumber;
		int win = 0;
		int lost = 0;
		int game = 0;
		int trials = 0;
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ArrayList<Integer> ar3 = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Welcome to the number guessing game.");
		System.out.println("For each game, you have at most 3 chances to guess a secret number from 1 to 10.");

		System.out.println("Enter a number between 1-10.Enter -1 to exit");
		number = in.nextInt();
		//While loop will exit when user enters -1 as sentinel value
		exitwhileloop: while (number != -1) {
			randomNumber = random.nextInt(10) + 1;
			game++;
			ar3.add(randomNumber);
			for (int i = 2; i >= 0; i--) {
				trials = trials + 1;
				if (number == -1) {
					break exitwhileloop;
				} else if (number == randomNumber) {
					win++;
					System.out.println("Congratulation,correct!Let’s start a new game");
					break;
				} else {
					System.out.println("Not correct, try again:");
					if (i == 0) {
						lost++;
						System.out.println("Not correct. You have reached your third trial. The correct number is "+ "" + +randomNumber);
						trials++;
						break;
					}
					number = in.nextInt();
				}

			}
			ar2.add(trials);
			trials = 0;
			System.out.println("Enter a number between 1-10 or enter -1 to exit");
			number = in.nextInt();
			total++;
		}

		System.out.println("Total games: " + total);
		System.out.println("Number of wins: " + win);
		System.out.println("Number of losts: " + lost);
		System.out.format("%10s %15s %15s", "Game", "Secret", "Trials");
		System.out.println();
		for (int i = 0; i <= game - 1; i++) {
			System.out.println();
			System.out.format("%10d %15d %15d", i + 1, ar3.get(i), ar2.get(i));

		}
	}
}
