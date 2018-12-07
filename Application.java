import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		//the following line needed to to 
		Application myCalculator = new Application();
		Scanner input = new Scanner(System.in);
		// Define variables
		double a; double b; double c;
		// get first number
		System.out.println("Enter your first number: ");
		a = input.nextDouble();
		// get second number
		System.out.println("Enter your second number: ");
		b = input.nextDouble();
		// ask what operation you wish to accomplish
		System.out.println("What do you wish to do? (1)add, (2)subtract, (3)multiply, or (4)divide: ");
		c = input.nextInt();
		//System.out.println("You entered " + c);
		
		// check if will divide by 0
		if (b == 0 && c == 4) {
			System.out.println("You cannot divide by 0!");
		}
		// else decide what operation to perform
		else if (c == 1) {
			System.out.println(myCalculator.add(a, b));	// calling add method
		}
		else if (c == 2) {
			System.out.println(myCalculator.subtract(a, b)); //calling subtract method
		}
		else if (c == 3) {
			System.out.println(myCalculator.multiply(a, b)); // calling multiply method
		}
		else if (c == 4) {
			System.out.println(myCalculator.divide(a, b)); // calling divide method
			
		}
		else {
			System.out.println("You did not enter a valid operation");
		}
		
	}
	public double add(double a, double b) {
		return a + b;
	}
	
	public double subtract(double a, double b) {
		return a - b;
	}
	
	public double multiply(double a, double b) {
		return a * b;
	}
	
	public double divide(double a, double b) {
		return a /b ;
	}
}
