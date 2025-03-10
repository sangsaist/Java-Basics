import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.print("Enter a number (negative number to exit): ");
            number = sc.nextInt();
            if (number >= 0) {
                sum += number; // Add the number to the sum if it's non-negative
            }
        } while (number >= 0); // Continue until a negative number is entered

        System.out.println("The sum of the entered numbers is: " + sum);
        sc.close(); // Close the scanner
    }
}