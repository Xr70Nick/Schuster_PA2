/*
 * Ask the user which units they would like to use 
 * Once the user chooses the units ask for height and weight
 * if metric is chosen do weight/ height squared 
 * if imperial 703 * weight / height squared
 * get the category's from the web site 
 * send your BMi calculation the method to find out what category you are apart of 
 * print your BMI and your category to the screen 
 */

import java.util.Scanner;
public class BMICalculator {
static float height;
static float weight;
static int choice;
static float BMI;
static String BMI_Catagory;
static Scanner in = new Scanner(System.in);

	public void readUserData() {
		choice = readUnitType(choice);
		readMeasurementData(choice);
	}
	public void caclulateBmi() {
		getBMI();
		setBMI(BMI);
		getBmiCategory();
	}
	public void displayBmi() {
		System.out.printf("Your BMI is %.2f",BMI);
		System.out.print("\nYour BMI catagory is "+ getBmiCategory());
	}
	private String calculateBmiCategory(float BMI) {
		if (BMI < 18.5 ) {
			BMI_Catagory = "Underweight";
			}
		else if (BMI >= 18.5 && BMI <= 24.9) {
			BMI_Catagory = "Normal weight";
		}
		else if (BMI >= 25 && BMI <= 29.9) {
			BMI_Catagory = "Overweight";
		}
		else if (BMI > 30) {
			BMI_Catagory = "Obesity";
		}
		return BMI_Catagory;
	}
	
	private int readUnitType(int choice) {
		choice = 0;
		while (choice < 1 || choice > 2 ) {
		System.out.printf("Which Unit Type would you like to use");
		System.out.printf("\n1.)Metric \n2.)Imperial\n");
		System.out.printf("Your Selection: ");
		choice = in.nextInt();
		}
		return choice;
		
		
	}
	private void readMeasurementData(int choice) {
		switch(choice) {
		case 1: readMetricData();break;
		case 2: readImperialData();break;
		}
	}
	private void readMetricData() {
		System.out.print("Enter your Height ( in meters ): ");
		height  = getHeight();
		setHeight(height);
		System.out.print("Enter your Weight ( in Kilograms ): ");
		weight = getWeight();
		setWeight(weight);
	}
	private void readImperialData() {
		System.out.print("Enter your Height ( in inches ): ");
		height = getHeight();
		setHeight(height);
		System.out.print("Enter your Weight ( in pounds ): ");
		weight = getWeight();
		setWeight(weight);
	}
	public static float getBMI() {
		if (choice == 1) {
			BMI = weight/(height*height);
		}
		else if (choice == 2) {
			BMI = (703 *weight)/(height*height);
		}
		return BMI;
	}
	public static void setBMI(float bMI) {
		BMI = bMI;
	}
	private float getHeight() {
		height = in.nextFloat();
		return height;
	}
	private void setHeight(float height) {
		this.height = height;
		if (this.height < 0) {System.exit(0);
		
		}
	}
	private float getWeight() {
		weight = in.nextFloat();
		return weight;
	}
	private  void setWeight(float weight) {
		this.weight = weight;
		if (this.weight < 0) {System.exit(0);
		
		}
	}
	public String getBmiCategory() {
		return calculateBmiCategory(BMI);
	}
	

}
	
