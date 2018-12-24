public class Calculator {

	int result;

	public int calculate(int num1, int num2, char operationValue) {
		
		switch(operationValue) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / num2;
			case '%':
				return num1 % num2;
			case '^':
				int result = 1;
				for(int i = 1; i <= num2; i++) {
					result = result * num1;
			}
				return result;
			default:
				System.out.print("Ошибка ввода.");
		}
		return 0;  
	}
}