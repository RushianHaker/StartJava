import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String continueUse;

        System.out.println("Приветствую тебя, введи свое имя: ");
        Player playerOne = new Player(scan.next());
        System.out.println("");
        System.out.println("Привет, " + playerOne.getName());
        System.out.println("");

        System.out.println("Приветствую тебя, введи сое имя: ");
        Player playerTwo = new Player(scan.next());
        System.out.println(""); 
        System.out.println("Привет, " + playerTwo.getName());
        System.out.println("");
        System.out.println("Смысл игры угадать загаданное число компьютером! "); 
        System.out.println("");
        System.out.println("Теперь, введи свое число: "); 

        GuessNumber guess = new GuessNumber(playerOne, playerTwo);

        do {
            guess.startGame();
            do {
                System.out.println("Хотите продолжить? [Yes/No]: ");
                continueUse = scan.next();
            } while (!continueUse.equals("Yes") && !continueUse.equals("No"));
        } while (continueUse.equals("Yes"));
        System.out.println("Спасибо,запускайте еще!");
    }
}