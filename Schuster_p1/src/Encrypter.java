/*Take the input sent from the main method
 * add 7 to each element of the array 
 * mod 10 each element of the array after adding 7
 * switch the first element with the third and the second element with the fourth
 * 
 */
public class Encrypter {

	public static void encrypt(int[] Input) {
		
		int maxNumber = 4;
		int PlaceHolder;
		for (int i = 0; i < maxNumber; i++)
		{
			Input[i] = (Input[i] + 7) % 10;
		}
		PlaceHolder = Input[0];
		Input[0] = Input[2];
		Input[2] = PlaceHolder;
		PlaceHolder = Input[1];
		Input[1] = Input[3];
		Input[3] = PlaceHolder;
		System.out.print("\nYour number encrypted is: ");
		for (int i = 0; i < maxNumber; i++) {
			System.out.print(Input[i]);
		}
	}

}
