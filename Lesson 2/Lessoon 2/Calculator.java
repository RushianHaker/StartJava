import java.util.Scanner;

public class Calculator {
   static Scanner scanner = new Scanner(System.in);

		int num1 = getint1();
		char operation_value = getOperation();			
		int num2 = getint2();
		int outcome = calculatorTest(num1, num2, operation_value);

	public static int getint1() {
		System.out.print("Введите первое число:");
		int num1 = scanner.nextInt();
		return num1;
	}

	public static char getOperation() {
		System.out.print("Введите математическую операцию:");
		char operation_value = scanner.next().charAt(0);
		return operation_value;
	}

	public static int getint2() {
		System.out.print("Введите второе число:");
		int num2 = scanner.nextInt();
		return num2;
	}

	public static int calculatorTest(int num1, int num2, char operation_value) {
		int outcome;
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
