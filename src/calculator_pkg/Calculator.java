package calculator_pkg;

public class Calculator {
	static int sum(int a, int b) {
		int result = a + b;
		return result;

	}

	static int product(int a, int b) {
		int result = a * b;
		return result;
	}

	static int subtraction(int a, int b) {
		int result = a - b;
		return result;
	}

	static double division(double a, double b) {
		// if we use int as params we will get a rounding error
		// we must use double instead of int
		if (a > b) {
			double result = a / b;
			return result;
		} else {
			System.out.print("Division cannot be performed!");
			return 0;
		}

	}

	public static void main(String[] args) {
		System.out.println("Sum is: " + sum(6, 4));
		System.out.println("Product is: " + product(6, 4));
		System.out.println("Subtration is: " + subtraction(6, 4));
		System.out.println("Divison is: " + division(6, 4));
		System.out.println(division(4, 6));

	}

}
