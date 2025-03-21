package interview;

import java.util.Scanner;

public class PatternExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}