import java.util.Scanner;  // Importing Scanner class for user input

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Scanner object
        char continueCalculation;  // Variable to store user choice for continuing

        do {
            // Prompt user to choose an operation
            System.out.print("Choose an operation (+, -, *, /): ");
            char operator = input.next().charAt(0);  // Reading the operation

            double num1, num2, result = 0; // Declaring variables
            boolean isValid = true; // Flag to check if operation is valid

            try {
                // Taking input for first number
                System.out.print("Enter first number: ");
                num1 = input.nextDouble();

                // Taking input for second number
                System.out.print("Enter second number: ");
                num2 = input.nextDouble();

                // Performing calculations based on the chosen operation
                switch (operator) {
                    case '+':
                        result = num1 + num2; // Addition
                        break;
                    case '-':
                        result = num1 - num2; // Subtraction
                        break;
                    case '*':
                        result = num1 * num2; // Multiplication
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2; // Division
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                            isValid = false; // Invalid operation flag
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operation entered.");
                        isValid = false; // Invalid operation flag
                }

                // Display result if operation was valid
                if (isValid) {
                    System.out.println("Result: " + result);
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter valid numbers.");
                input.next(); // Clear invalid input to prevent infinite loop
            }

            // Asking user if they want to continue
            System.out.print("Would you like to calculate again? (y/n): ");
            continueCalculation = input.next().toLowerCase().charAt(0);

        } while (continueCalculation == 'y'); // Loop continues if user enters 'y'

        // Exiting message
        System.out.println("Calculator closed. Have a great day!");

        input.close(); // Closing Scanner to free resources
    }
}
