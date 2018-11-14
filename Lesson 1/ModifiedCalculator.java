import java.util.Scanner;

public class ModifiedCalculator {
   static Scanner scanner = new Scanner(System.in);

	public static void main (String[] args) {
		double num1 = getDouble();
		char operation_value = getOperation();			
		double num2 = getDouble();
		double outcome = calculatorTest(num1, num2, operation_value);
		System.out.print("Ответ:" + outcome);
	}

	public static double getDouble() {
		System.out.print("Введите первое число:");
		double num = scanner.nextDouble();
		return num;
	}

	public static char getOperation() {
		System.out.print("Введите математическую операцию:");
		char operation_value = scanner.next().charAt(0);
		return operation_value;
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