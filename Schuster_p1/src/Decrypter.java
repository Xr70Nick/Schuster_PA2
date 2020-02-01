/*
 * Take input from the main method 
 * subtract 7 from each element
 * mod 10 each element after subtracting 7
 * if the number is negative add 10 to bring it back to the original number
 */
public class Decrypter {
	
	public static void decrypt(int[] Input) {

		int maxNumber = 4;
		int PlaceHolder;
		for (int i = 0; i < maxNumber; i++) {
			Input[i] = ((Input[i]-7) % 10);
			if(Input[i] < 0) {
				Input[i] = Input[i] + 10;
			}
		}
		PlaceHolder = Input[0];
		Input[0] = Input[2];
		Input[2] = PlaceHolder;
		PlaceHolder = Input[1];
		Input[1] = Input[3];
		Input[3] = PlaceHolder;
		System.out.print("\nYour Decrypted number is: ");
		for (int i = 0; i < maxNumber; i++) {
			System.out.print(Input[i]);
		}
		
		

	}

}

	
	


