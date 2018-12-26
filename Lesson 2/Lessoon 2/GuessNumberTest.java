import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String continueUse;

        System.out.println("Hi, bro! Enter your name player one: ");
        Player playerOne = new Player(scan.next());
        System.out.println("Hi, " + playerOne.getName());

        System.out.println("Hi, bro! Enter name player two: ");
        Player playerTwo = new Player(scan.next());
        System.out.println("Hi, " + playerTwo.getName());

        System.out.println("Now, try to guess the number: "); 

        GuessNumber guess = new GuessNumber(playerOne, playerTwo);

        do {
            guess.startGame();
            do {
                System.out.println("Wanna continue? [Yes/No]: ");
                continueUse = scan.next();
            } while (!continueUse.equals("Yes") && !continueUse.equals("No"));
        } while (continueUse.equals("Yes"));
        System.out.println("Good luck, bro");
    }
}