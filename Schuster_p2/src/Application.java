
public class Application {

	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.caclulateBmi();
		app.displayBmi();
	}

}
