package operators;
import java.util.Scanner;
public class unary2 {
    public static void main(String[] args) {
        Scanner un = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = un.nextInt();
        System.out.println("Initial value: " + num);
        System.out.println("Post-increment: " + (num++)); // First print, then increase
        System.out.println("After post-increment: " + num);
        System.out.println("Pre-increment: " + (++num)); // First increase, then print
        System.out.println("Post-decrement: " + (num--)); // First print, then decrease
        System.out.println("After post-decrement: " + num);
        System.out.println("Pre-decrement: " + (--num)); // First decrease, then print
        un.close();
    }
    
}
