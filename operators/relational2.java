package operators;

import java.util.Scanner;

public class relational2 {
    public static void main(String[] args) {
        Scanner ar2 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = ar2.nextInt();
        System.out.println("Enter the second number: ");
        int b = ar2.nextInt();
        System.out.println(a=b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        ar2.close();

    }
    
}
