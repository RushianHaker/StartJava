public class Calculator {

    public static void main(String[] args) {
    
    double outcome = calculatorTest(num1, num2, operation_value);
    
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
            System.out.println("Ошибка ввода.");
        } 
        return outcome;
   } 
}	