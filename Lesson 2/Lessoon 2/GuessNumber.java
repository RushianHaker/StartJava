import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
    
        double computerNumber = (int) (Math.random()*101);

        do {
            System.out.println("Введи число, " + playerOne.getName());
            playerOne.setNumber(scan.nextInt());

            if (playerOne.getNumber() > computerNumber) {
                System.out.println(playerOne.getName() + ", твое число больше");
            } else if (playerOne.getNumber() < computerNumber) {
                System.out.println(playerOne.getName() + " , твое число меньше");
            } else {
                System.out.println("Мои поздравления!");
                System.out.println(playerOne.getName() + " Ты угадал ^^)");
            }

            System.out.println("Введи число, " + playerTwo.getName());
            playerTwo.setNumber(scan.nextInt());

            if (playerTwo.getNumber() > computerNumber) {
                System.out.println(playerTwo.getName() + " , твое число больше");
            } else if (playerTwo.getNumber() <  computerNumber) {
                System.out.println(playerTwo.getName() +  " , твое число меньше");
            } else  {
                System.out.println("Мои поздравления!");
                System.out.println(playerTwo.getName() + " Ты угадал ^^)");
            }
        } while (playerOne.getNumber() != computerNumber && playerTwo.getNumber() != computerNumber);
    }
}