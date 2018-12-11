import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator(); 	

		System.out.print("Введите первое число:");
		int num1 = scanner.nextInt();

		System.out.print("Введите математическую операцию:");
		char operationValue = scanner.next().charAt(0);

		System.out.print("Введите второе число:");
		int num2 = scanner.nextInt();

		int outcome = calc.calculate(num1, num2, operationValue);

		System.out.print("Ответ: "+ outcome);
	}
}
