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
            System.out.println("Insert the number, " + playerOne.getName());
            playerOne.setNumber(scan.nextInt());

            if (playerOne.getNumber() > computerNumber) {
                System.out.println(playerOne.getName() + ", number is greater");
            } else if (playerOne.getNumber() < computerNumber) {
                System.out.println(playerOne.getName() + " , number is less");
            } else {
                System.out.println("My congratulations!");
                System.out.println(playerOne.getName() + " You guessed ^^)");
            }

            System.out.println("Insert the number, " + playerTwo.getName());
            playerTwo.setNumber(scan.nextInt());

            if (playerTwo.getNumber() > computerNumber) {
                System.out.println(playerTwo.getName() + " , number is greater");
            } else if (playerTwo.getNumber() <  computerNumber) {
                System.out.println(playerTwo.getName() +  " , number is less");
            } else  {
                System.out.println("My congratulations!");
                System.out.println(playerTwo.getName() + " You guessed ^^)");
            }
        } while (playerOne.getNumber() != computerNumber && playerTwo.getNumber() != computerNumber);
    }
}