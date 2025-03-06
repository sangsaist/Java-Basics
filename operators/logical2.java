package operators;
import java.util.Scanner;
public class logical2 {
    public static void main(String[] args) {
        Scanner vote = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = vote.nextInt();
        if(age>18 && age<100){
        System.out.println("Your Are not eligible for vote because you age is "+age+"which is lesser then 18 or greater then 100");
    }
    else;{
        System.out.println("You are eligible for vote because your age is "+ age +" which is greater then 18 and lesser then 100");
    }
    vote.close();
}
}
