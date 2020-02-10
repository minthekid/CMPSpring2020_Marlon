
import java.util.Scanner; 

public class BMICalc {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("User 1, Enter your name: ");
		System.out.println("User 2, Enter your name: ");
		System.out.println("User 3, Enter your name: ");
		
		String name1 = scnr.next();
		String name2 = scnr.next();
		String name3 = scnr.next();
		
		System.out.println("User 1, Enter your weight in pounds: ");
		System.out.println("User 2, Enter your weight in pounds: ");
		System.out.println("User 3, Enter your weight in pounds: ");
		
		double w1 = scnr.nextDouble();
		double w2 = scnr.nextDouble();
		double w3 = scnr.nextDouble();
		
		System.out.println("User 1, Enter your height in inches: ");
		System.out.println("User 2, Enter your height in inches: ");
		System.out.println("User 3, Enter your height in inches: ");
		
		double h1 = scnr.nextDouble();
		double h2 = scnr.nextDouble();
		double h3 = scnr.nextDouble();
		
		double BMI1 = (w1 * 703) / (h1 * h1);
		double BMI2 = (w2 * 703) / (h2 * h2);
		double BMI3 = (w3 * 703) / (h3 * h3);
		
		System.out.printf("User 1, Your BMI is: %.2f" , BMI1);
		System.out.printf("User 2, Your BMI is: " + BMI2);
		System.out.printf("User 3, Your BMI is: " + BMI3);
		


	}

}
