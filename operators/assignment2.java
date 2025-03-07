package operators;
import java.util.Scanner;
public class assignment2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner as2 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = as2.nextInt();
        System.out.println("Enter the second number: ");
        int b = as2.nextInt();
        a *= 20;
        b %= 40;
        System.out.println("The value of first number after multiplication: "+ a);
        System.out.println("The value of second number after modulus: "+ a);
        as2.close();

    }
}
