/*Ask the user if they would like to Encrypt or Decrypt
 * Take a number from the user and store it into input
 * take every number from the int input and store it in an array 
 * Send input to either the Encrypt class or the Decrypt class depending on the users choice
 * 
 */

import java.util.Scanner;

public class Application {
	
	
	public static void main(String[] args) {
		int maxNumber = 4;
		Scanner in = new Scanner(System.in);
		
		int UserChoice;
		int Input = 0;
		int[] Input1 = {0,0,0,0};
		int x = 1;
		
		while (x == 1) {
		System.out.print("\nWould you like to encrypt your number or decrypt your number?(Choose 1 or 2)\n");
		System.out.print("1.)Encrypt\n2.)Decrypt\n3.)End Program\nYour Selection: ");
		UserChoice = in.nextInt();
		switch (UserChoice) {
		case 1:System.out.print("Enter the 4 digit number you wish to be encrypted: ");
		Input = in.nextInt();
		for (int i = 3; i >= 0 ; i--) {
			Input1[i] = Input % 10; 
			Input /= 10;
		}
				Encrypter.encrypt(Input1);
				break;
		case 2:System.out.print("Enter the 4 digit number you wish to be decrypted: ");
		Input = in.nextInt();
		for (int i = 3; i >= 0 ; i--) {
			Input1[i] = Input % 10; 
			Input /= 10;
		}
				Decrypter.decrypt(Input1);
				break;
		case 3: System.out.println("Goodbye!");x = 2; break;
		}
		}
		
		
		
	}

	

}
