public class Calculator {

    public static void main(String[] args) {
        int number1 = 13;  
        int number2 = 5;
        char mathOperation = '*';
        
         if (mathOperation == '/') {
            System.out.println(number1 / number2);
         } else if (mathOperation == '*') {
      		System.out.println(number1 * number2);
         } else if (mathOperation == '+') {
          	System.out.println(number1 + number2);
         } else if (mathOperation == '-') {
            System.out.println(number1 - number2);
         } else if (mathOperation == '%') {
            System.out.println(number1 % number2);
         } else if (mathOperation == '^') {
            int result_drobi = 1;
            for (int x = 1; x <= number2 ; x++) {
                result_drobi*= number1;
         }
         System.out.println(result_drobi);
      }    
   }
}	











