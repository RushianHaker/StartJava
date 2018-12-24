public class GuessNumberTest {

    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

        System.out.println("First player input your name, please.");
        String userPlayerOne = input.nextLine();
        Player playerOne = new Player(userPlayerOne);

        System.out.println("Second player input your name, please.");
        String userPlayerTwo = input.nextLine();
        Player playerTwo = new Player(userPlayerTwo);

        System.out.println("Guess number!!!");
        
        int randomNumber = 0;
        GuessNumber game = new GuessNumber(userPlayerOne, userPlayerTwo, randomNumber);
        randomNumber = game.guessNumber(randomNumber);
        System.out.println("First player inputs number first");
        do {
        
        boolean answer = game.guessNumber(userPlayerOne, userPlayerTwo, randomNumber);
        
            do {    
                System.out.println("Do you want to continue?[yes/no]");
                userAnswer = input.next();
                if (userAnswer.equals("yes")) {
                    System.out.println("Guess number!!!");
                } else if (userAnswer.equals("no")) {
                    System.out.println("Bye");
                    break;
                } else {
                    System.out.println("Error!!");
                }
            } while (!userAnswer.equals("yes"));
        } while (!userAnswer.equals("no"));
        
       
    }
}