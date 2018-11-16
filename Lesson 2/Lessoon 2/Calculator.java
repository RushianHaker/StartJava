public class Calculator {

	public static int calculat(int num1, int num2, char operationValue) {
		int outcome = 0;
		switch(operationValue) {
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
		}  
			return outcome;
	}
}
//Осталось всделать (^) и (%);