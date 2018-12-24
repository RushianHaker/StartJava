import java.util.Scanner;

public class GuessNumber {

    private int userNumber;
    private int randomNumber;
     

    public GuessNumber(int randomNumber) {
        randomNumber = (int) (Math.random() * 100 + 1);
    }

    public boolean guessNumber(userPlayerOne, userPlayerTwo, randomNumber) {
        boolean answer = false;
        int turn = 1;
        int userNumber = 0;
        while (answer) {

            if (turn % 2 == 1) {
                System.out.println(userPlayerOne + " tries to guess the number: ");
                userNumber = input.nextInt();
            } else {
                System.out.println(userPlayerTwo + " tries to guess the number: ");
                userNumber = input.nextInt();
            }
            if (turn % 2 == 1) {
                System.out.println(userPlayerOne + " is a winner!!");
            } else {
                System.out.println(userPlayerTwo + " is a winner");
            }

            if (userNumber == randomNumber) {
                answer = true;
                System.out.println("Well done!!");

            } else if (userNumber > randomNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("The number is larger.");
            }

            turn += 1;
        }
        return answer;
    }
}