import java.util.Scanner; // Import Scanner for user input
import java.util.Random;  // Import Random to generate a number

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = -1;  // Initialize with a value outside the valid range
        int attempts = 0;  // Counter for the number of attempts

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        // Loop until the user guesses correctly
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");

            // Validate input to ensure it's an integer
            if (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
                continue; // Restart loop
            }

            userGuess = scanner.nextInt(); // Read user input
            attempts++; // Increment attempt count

            // Check user's guess
            if (userGuess > numberToGuess) {
                System.out.println("📉 Too high! Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("📈 Too low! Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
