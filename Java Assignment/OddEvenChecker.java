import java.util.Scanner; // Import Scanner for user input

public class OddEvenNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        int number = 0; // Variable to store user input

        // Input validation loop
        while (true) {
            System.out.print("🔢 Enter an integer: ");
            
            // Check if input is a valid integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break; // Exit loop if input is valid
            } else {
                System.out.println("❌ Invalid input! Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }

        // Check if the number is odd or even
        if (number % 2 == 0) {
            System.out.println("✅ The number " + number + " is EVEN.");
        } else {
            System.out.println("✅ The number " + number + " is ODD.");
        }

        scanner.close(); // Close Scanner
    }
}
