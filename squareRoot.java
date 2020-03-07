import java.util.Scanner;
public class squareRoot {
	public static void main (String [] args) {
		boolean tryagain = true;
		double num;

		System.out.println("Hi there! Welcome to my square root calculator! :)");
			while (tryagain == true) {
				Scanner scnr = new Scanner(System.in);
				
				System.out.println("\nPlease enter a number:");
				num = scnr.nextDouble();
				num = sqrt(num);
				System.out.println("The square root of that number is " + num);
				System.out.println("\nDo you want the square root of another number?");
				String again = scnr.next();
				if (again.equals("yes")) {
					tryagain = true;
				} else if (again.equals("no")){
					System.out.println("Thank you for using the square root calculator. Bye! :)");
					tryagain = false;
				} else {
					System.out.println("Invalid option. Please enter a number: ");
					tryagain = true;
				}
			}	
		}
	
	public static double sqrt (double s) {
		double result = Math.sqrt(s);
		return result;	
	}
}
