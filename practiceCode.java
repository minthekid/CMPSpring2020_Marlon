/**
 * 
 * @author Marlon Nettles
 * created:2.5.2020
 * description: compute product of three numbers when entered by users
 *
 */
import java.util.Scanner;;
public class practiceCode {
	public static void main (String[]args) {
		Scanner scnr = new Scanner(System.in);  
		
		int number1;
		int number2;
		int number3;
		
		System.out.println("Welcome to the Product Program");
		System.out.println("Enter your three numbers below to get your product");
	
		number1 = scnr.nextInt();
		number2 = scnr.nextInt();
		number3 = scnr.nextInt();
		
		int product = number1 * number2 * number3;
		System.out.println("Your product is: " +product);
		
		
		

	}
}
