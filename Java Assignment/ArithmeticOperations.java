import java.util.Scanner; // Import Scanner for user input

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        int firstNumber , secondNumber ; // Variables for numbers

        // Input first number with validation
        while (true) {
            System.out.print("Enter first number: ");
            if (scanner.hasNextInt()) {
                firstNumber = scanner.nextInt();
                break; // Exit loop if valid input
            } else {
                System.out.println("❌ Invalid input! Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }

        // Input second number with validation
        while (true) {
            System.out.print("Enter second number: ");
            if (scanner.hasNextInt()) {
                secondNumber = scanner.nextInt();
                break; // Exit loop if valid input
            } else {
                System.out.println("❌ Invalid input! Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }

        // Perform calculations
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;

        // Check for division by zero
        double division;
        if (secondNumber != 0) {
            division = (double) firstNumber / secondNumber;
        } else {
            division = Double.NaN; // Not a Number (NaN) if division by zero
        }

        // Display results
        System.out.println("\n📊 --- Arithmetic Operations Result ---");
        System.out.println("➕ Addition: " + addition);
        System.out.println("➖ Subtraction: " + subtraction);
        System.out.println("✖️ Multiplication: " + multiplication);

        // Display division result with appropriate message
        if (secondNumber != 0) {
            System.out.println("➗ Division: " + String.format("%.2f", division));
        } else {
            System.out.println("❌ Division: Undefined (Cannot divide by zero)");
        }

        scanner.close(); // Close Scanner
    }
}
