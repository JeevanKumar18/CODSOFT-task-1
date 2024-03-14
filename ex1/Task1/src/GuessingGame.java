import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random randoms = new Random();
        int score = 0;
        String playAgain = "";

        do {
            int attempt = 0;
            int number = randoms.nextInt(100) + 1;
            int guess = 0;

            System.out.println("Guess a number between 1 and 100:");

            while (guess != number && attempt < 10) {
                guess = s.nextInt();
                attempt++;

                if (guess > number) {
                    System.out.println("Too high! Try again.");
                } else if (guess < number) {
                    System.out.println("Too low! Try again.");
                }
            }

            if (guess == number) {
                System.out.println("Congratulations! You guessed the number.");
                score += 10 - attempt;
            } else {
                System.out.println("Sorry, you didn't guess the number. The number was " + number);
            }

            System.out.println("Your score is: " + score);
            System.out.println("Do you want to play again? (yes/no)");
            playAgain = s.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing. Your final score is: " + score);
        s.close();
    }
}