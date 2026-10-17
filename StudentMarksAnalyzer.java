import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       STUDENT MARKS ANALYZER (Java)    ");
        System.out.println("========================================");

        int n = 0;
        while (true) {
            System.out.print("Enter number of students (N): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer greater than 0.\n");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.\n");
                scanner.next(); // consume invalid input
            }
        }

        Double[] marks = new Double[n];
        double sum = 0.0;

        System.out.println("\nEnter marks for " + n + " students:");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Student " + (i + 1) + " marks: ");
                if (scanner.hasNextDouble()) {
                    marks[i] = scanner.nextDouble();
                    sum += marks[i];
                    break;
                } else {
                    System.out.println("Invalid input! Please enter numeric marks.");
                    scanner.next();
                }
            }
        }

        // Sort descending
        Arrays.sort(marks, Collections.reverseOrder());

        double average = sum / n;

        System.out.println("\n========================================");
        System.out.println("             RESULTS                    ");
        System.out.println("========================================");
        System.out.println("Total Students: " + n);
        System.out.print("Sorted Marks (Descending): ");
        System.out.println(Arrays.toString(marks));

        System.out.print("Top 3 Marks: ");
        int topLimit = Math.min(3, n);
        for (int i = 0; i < topLimit; i++) {
            System.out.print(marks[i] + (i < topLimit - 1 ? ", " : ""));
        }
        System.out.println();

        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("========================================");

        scanner.close();
    }
}
