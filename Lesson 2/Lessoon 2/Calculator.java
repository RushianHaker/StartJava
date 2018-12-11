public class Calculator {

	int outcome;

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
				int outcome = 1;
				for(int i = 1; i <= num2; i++) {
					outcome = outcome * num1;
			}
				return outcome;
			default:
				System.out.print("Ошибка ввода.");
		}
		return 0;  
	}
}