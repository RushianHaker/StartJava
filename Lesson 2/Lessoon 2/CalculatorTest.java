import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userAnswer;
        do {

            System.out.print("Введите число: ");
            int num1 = input.nextInt();

            System.out.print("Введите мат.операцию (+, -, *, /, ^, %): ");
            char operationValue = input.next().charAt(0);

            System.out.print("Введите число: ");
            int num2 = input.nextInt();

            Calculator calculator = new Calculator();
            int result = calculator.calculate(num1, num2, operationValue);
            System.out.println("Ответ: " + result);

            do {    
                System.out.println("Вы хотите продолжить? [да/нет]");
                userAnswer = input.next();
                if (userAnswer.equals("да")) {
                    System.out.println("Введите данные еще раз.");
                } else if (userAnswer.equals("нет")) {
                    System.out.println("Пока и удачи !");
                    break;
                } else {
                    System.out.println("Ошибка!!");
                }
            } while (!userAnswer.equals("да"));
        } while (!userAnswer.equals("нет"));
    }
}