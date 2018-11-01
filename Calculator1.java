public class Calculator1 {

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
            int Result = 1;
            for (int x = 1; x <= number2 ; x++) {
                Result*= number1;
         }
         System.out.println(Result);
      }    
   }
}	











