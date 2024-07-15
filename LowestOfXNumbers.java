import java.util.Scanner;

/**
 * finds lowest of n amount of numbers
 * @author Suyash Patel
 */
public class LowestOfXNumbers {

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("From how many numbers would you like to find the lowest of?");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Enter a valid input");
            System.exit(1);
        }

        double lowest = Double.POSITIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ": ");
            double num = scanner.nextDouble();
            if (num < lowest) {
                lowest = num;
            }
        }

        if (lowest == Double.POSITIVE_INFINITY) {
            System.out.println("No lowest number");
        } else {
            System.out.println("Lowest number: " + lowest);
        }

        scanner.close();

    }
}
