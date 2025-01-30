import java.util.Scanner; // Import Scanner for user input

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        int numSubjects = 5;  // Define number of subjects
        int[] marks = new int[numSubjects]; // Array to store marks
        int totalMarks = 0; // Variable to store total sum

        // Input marks for each subject
        System.out.println("📘 Enter marks for " + numSubjects + " subjects (out of 100):");
        for (int i = 0; i < numSubjects; i++) {
            while (true) { // Loop until a valid input is given
                System.out.print("Subject " + (i + 1) + ": ");

                // Validate input
                if (scanner.hasNextInt()) {
                    marks[i] = scanner.nextInt();

                    // Ensure marks are within a valid range (0-100)
                    if (marks[i] >= 0 && marks[i] <= 100) {
                        totalMarks += marks[i]; // Add to total
                        break; // Exit loop if input is valid
                    } else {
                        System.out.println("❌ Invalid! Marks must be between 0 and 100.");
                    }
                } else {
                    System.out.println("❌ Invalid input! Please enter a number.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        // Calculate average
        double averageMarks = (double) totalMarks / numSubjects;

        // Determine grade based on average
        char grade;
        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\n📊 --- Grade Report ---");
        System.out.println("📝 Total Marks: " + totalMarks + " / " + (numSubjects * 100));
        System.out.println("📈 Average Marks: " + String.format("%.2f", averageMarks));
        System.out.println("🏅 Grade: " + grade);

        scanner.close(); // Close Scanner
    }
}
