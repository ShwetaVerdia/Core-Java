package classworkitujava;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This java program calculates average of quiz score entered by user
 * And final score excluding lowest score entered by user
 * @author Shweta Verdia Student ID 84224
 */

public class ScoreCalculator84224 {
    int minIndex;
    int count;
    double[] score;
    // newScore is the new array after the lowest score being removed
    double[] newScore;

    /**
     * Computes average of quiz score
     * @return average of the score array
     */
    public double averageOfScore() {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        average = sum / score.length;
        return average;

    }

    /**
     * Find out the lowest/minimum number from the elements of array
     * @return minimum number
     */
    public double minimumNumber() {
        double minimum = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] < minimum)
                minimum = score[i];
        }
        return minimum;
    }

    /**
     * Find out the index/position of minimum number among the elements of array
     * @return index of lowest array element
     */
    public int getMinimumIndex() {
        minIndex = 0;
        for (int i = 1; i < score.length; i++) {
            if (score[i] < score[minIndex])
                minIndex = i;
        }
        return minIndex;

    }

    /**
     * Remove the lowest element of array using its index and shifting the array elements
     * @return new array with lowest element being removed
     */
    public double[] getNewArray() {
        int minInd = getMinimumIndex();
        for (int i = minInd; i < score.length - 1; i++) {
            score[i] = score[i + 1];
        }
        newScore = Arrays.copyOf(score, score.length - 1);
        return newScore;

    }

    /**
     * Computes final score i.e. sum of new array
     * @return finalScore
     */
    public double finalScore() {
        double finalScore = 0;
        int newArrlen = getNewArray().length;
        for (int i = 0; i < newArrlen; i++) {
            finalScore = finalScore + newScore[i];
        }
        return finalScore;
    }

    //Creating object of scanner class for length of array and elements of array entered by user
    
    public void intiliazeArray() {
        System.out.println("Enter the count of scores to be used as Size of array:");
        Scanner input = new Scanner(System.in);
        count = input.nextInt();

        System.out.print("Enter the elements of array: ");
        score = new double[count];
        for (int i = 0; i < count; i++) {
            score[i] = input.nextDouble();

        }

    }

    public static void main(String[] args) {
        ScoreCalculator84224 sc = new ScoreCalculator84224();
        sc.intiliazeArray();
        System.out.println("The average is " + sc.averageOfScore());
        // printing the average of score array
        System.out.println("FinalScore excluding lowest score is " + sc.finalScore());

    }

}
