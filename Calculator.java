public class Calculator {

    public static void main(String[] args) {
        int number1 = 13;  
        int number2 = 5;
        char mathOperation = '*';
        
         if(mathOperation == '/') {
            System.out.println(number1 / number2);
         }else if (mathOperation == '*') {
      		System.out.println(number1 * number2);
         }else if (mathOperation == '+') {
          	System.out.println(number1 + number2);
         }else if (mathOperation == '-') {
            System.out.println(number1 - number2);
         }else if (mathOperation == '%') {
            System.out.println(number1 % number2);
         }else if (mathOperation == '^') {
            int fractionalResult = 1;
            for (int i = 1; i <= number2 ; i++) {
                fractionalResult *= number1;
         }  System.out.println(fractionalResult);
       }    
   }
}	











