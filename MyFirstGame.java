import java.util.Scanner;
public class MyFirstGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Я загадал число от 1 до 100, твоя задача - отгадать его!");
        System.out.println("Удачи!");
        System.out.println("Введите свое число.");
        
         int guessNumber = 45;
         int playerNumber;

          do {
                 playerNumber = scan.nextInt();
             if (playerNumber < guessNumber) {
                 System.out.println("Введеное мной число - больше!");
             } else if (playerNumber > guessNumber) {
                 System.out.println("Введеное мной число - меньше!");
             } else {
                 break;
             }  
          }  while(playerNumber != guessNumber);
               
                 System.out.println("Поздравляю, ты угадал!");                         
    }
}