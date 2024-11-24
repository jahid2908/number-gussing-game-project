import java.util.Scanner;

class NumberGuessingGame {
    private int numberToGuess = 5;

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 10: ");
        int userGuess = scanner.nextInt();

        if (userGuess == numberToGuess) {
            System.out.println("Correct! You guessed it.");
        } else {
            System.out.println("Wrong! The correct number was " + numberToGuess);
        }
        scanner.close();
    }
}

public class NumberGuessingGameApp {
    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.playGame();
    }
}
