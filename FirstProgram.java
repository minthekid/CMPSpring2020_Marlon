/**
 *  
 * @author Marlon
 * created: 1.29.2020
 * desc: This program calculates the user's Birth Year
 *
 **/
import java.util.Scanner;
public class FirstProgram {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to My First Program \n This progrgam calculates your Birth Year");
		System.out.print("Please Enter your age: ");
		int age = keyboard.nextInt();
		
		int birthYear = 2020-age;
		System.out.println("You are most likely to be born in... " + birthYear);
	}
}
