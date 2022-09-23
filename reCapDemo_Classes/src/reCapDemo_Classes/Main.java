package reCapDemo_Classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Math math = new Math();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value: 1-Addition 2-Subtract 3-Divide 4-Multiply");
		int operation = scan.nextInt();
		System.out.println("Enter first number");
		int number1 = scan.nextInt();
		System.out.println("Enter second number");
		int number2 = scan.nextInt();
		int result;

		if (operation == 1) {
			result = math.Add(number1, number2);
			System.out.println("Result: " + result);
		}

		if (operation == 2) {
			result = math.Subtract(number1, number2);
			System.out.println("Result: " + result);
		}

		if (operation == 3) {
			result = math.Divide(number1, number2);
			System.out.println("Result: " + result);
		}

		if (operation == 4) {
			result = math.Multiply(number1, number2);
			System.out.println("Result: " + result);
		}

	}

}
