package mobile_pin;

import java.util.Scanner;

public class Mobilepin {

	public static void main(String[] args) {
		int correct_pin = 12345;
		
		Scanner input= new Scanner(System.in);
		for(int attempts=1; attempts<=3; attempts++) {
			System.out.println("Attempt " + attempts + ": Enter your Pin");
			 int pin = input.nextInt();
		     input.nextLine();
		     
		     if (pin ==correct_pin) {
					System.out.println("Correct PIN");
					break;
				}else { 			
					System.out.println("The PIN you have entered is incorrect. Please enter correct Pin");
				}
		     
		     if (attempts == 3) {
	               System.out.println("Maximum attempts reached. Account Locked.");
		}
					

	}

}
}
