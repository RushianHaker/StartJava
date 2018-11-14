import java.util.Scanner;

public class Calculator {
   static Scanner scanner = new Scanner(System.in);

		double num1 = getDouble1();
		char operation_value = getOperation();			
		double num2 = getDouble2();
		double outcome = calculatorTest(num1, num2, operation_value);

	public static double getDouble1() {
		System.out.print("Введите первое число:");
		double num1 = scanner.nextDouble();
		return num1;
	}

	public static char getOperation() {
		System.out.print("Введите математическую операцию:");
		char operation_value = scanner.next().charAt(0);
		return operation_value;
	}

	public static double getDouble2() {
		System.out.print("Введите второе число:");
		double num2 = scanner.nextDouble();
		return num2;
	}

	public static double calculatorTest(double num1, double num2, char operation_value) {
		double outcome;
		switch(operation_value) {
			case '+':
				outcome = num1 + num2;
				break;
			case '-':
				outcome = num1 - num2;
				break;
			case '*':
				outcome = num1 * num2;
				break;
			case '/':
				outcome = num1 / num2;
				break;
			default:
			System.out.print("Ошибка ввода.");
			outcome = calculatorTest(num1, num2, getOperation());
		}  
			return outcome;
	}
}
