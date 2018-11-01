import java.util.Scanner;
public class Calculator3 {
	
	public static void main(String[] args) {	
  		Scanner scan = new Scanner(System.in);
 		Scanner reader = new Scanner(System.in); 
			
			System.out.print("Введите 1-е число: ");
   				double number1 = scan.nextDouble(); 
			
			System.out.print("Введите символ математической операции: ");
				char mathoperation = reader.next().charAt(0);
 			
 			System.out.print("Введите 2-е число: ");
   				double number2 = scan.nextDouble();
         
	if (mathoperation == '/') {
		  	System.out.print("Ответ:");
		  	System.out.println(number1 / number2);
		} else if (mathoperation == '*') {
			System.out.print("Ответ:");
		  	System.out.print(number1 * number2);
		} else if (mathoperation == '+') {
			System.out.print("Ответ:");
		  	System.out.print(number1 + number2);
		} else if (mathoperation == '-') {
		  	System.out.print("Ответ:");
		    System.out.print(number1 - number2);
		} else if (mathoperation == '%') {
		  	System.out.print("Ответ:");
		    System.out.print(number1 % number2);
		} else if (mathoperation == '^') {
		 		int rezyltat = 1;
		        for (int x = 1; x <= number2 ; x++) {
		        	rezyltat *= number1;
		}
		    	System.out.print("Ответ:");
		    	System.out.print(rezyltat);



		}
	}
}	
