/**
 * 
 * @author Student
 * created: 2.24.2020
 * Description: This program will make the user guess the right number.
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGuesser {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("Welcome. In this game, you will have to guess the correct number.");
		System.out.println("Please enter the number you want to guess between 1 and 10:");
		int userInput = scnr.nextInt();
		int rightNum = rd.nextInt(10);
		
		if (userInput == rightNum) {
			for(int i=0;i<3;i++) {
				System.out.println("Victory!");
			}
		}
		
		else {
			for(int i=0;i<3;i++) {
				System.out.println("Game Over!");
			}
		}
		

	}

}
