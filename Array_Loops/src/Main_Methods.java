import java.util.Scanner;
import java.util.stream.IntStream;

public class Main_Methods {

	final static int[] LIMIT_NUMS = new int[8];
	static int sum = 0;
	static double average = 0;

	public static void main(String[] args) {

		System.out.println("Enter 8 numbers and select the following options");
		System.out.println("Enter your 8 numbers>> ");
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 8; i++) {
			System.out.print("Enter a Number>> ");
			LIMIT_NUMS[i] = input.nextInt();
		}

		System.out.println(
				"These are the following options " + " \n" + "Press (1) to display all 8 numbers that you have inputed"
						+ "\n" + "Press (2) to display all 8 numbers in reverse" + " \n"
						+ "Press (3) to display the SUM of all 8 numbers that you have inputed" + " \n"
						+ "Press (4) to display the numbers that is lower than 8" + " \n"
						+ "Press (5) to display the numbers that are higher than the Calculated average");

		System.out.print("Choose your following options>> ");
		Scanner input2 = new Scanner(System.in);
		int userInput = input2.nextInt();

		switch (userInput) {
		case 1:
			displayIntegers();
			break;
		case 2:
			displayReverseInterhers();
			break;

		case 3:
			displaySumOfArrays();
			break;
		case 4:
			displayValuesLessThan8();
			break;

		case 5:
			displaytheAverage();
			break;
		default:
			System.out.println("Sorry the input is Invalid!!!");
		}

	}

	private static void displaytheAverage() {
		System.out.println("These are the numbers that are higher than the Average");
		double sum = IntStream.of(LIMIT_NUMS).sum();

		average = sum / 8;

		for (int i = 0; i < LIMIT_NUMS.length; i++) {

			if (average < LIMIT_NUMS[i]) {
				System.out.println(LIMIT_NUMS[i]);
			}

		}

	}

	private static void displayValuesLessThan8() {
		System.out.println("These are the Values that are less than the Limiting argument");
		for (int i = 0; i < LIMIT_NUMS.length; i++) {
			if (8 > LIMIT_NUMS[i]) {
				System.out.println(LIMIT_NUMS[i]);
			}
		}

	}

	private static void displaySumOfArrays() {
		System.out.println("These are the sums of all numbers that you have inputted");
		int sum = IntStream.of(LIMIT_NUMS).sum();
		System.out.println(sum);
	}

	private static void displayReverseInterhers() {
		System.out.println("These are the numbers that you have inputted in reverse");
		for (int i = LIMIT_NUMS.length - 1; i >= 0; i--) {
			System.out.println(LIMIT_NUMS[i]);

		}
	}

	private static void displayIntegers() {
		System.out.println("These are the numbers you have inputted ");
		for (int i = 0; i < 8; i++) {

			System.out.println(LIMIT_NUMS[i]);

		}
	}
}