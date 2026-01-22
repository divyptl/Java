//Name: Divya Patel, Date: 15/01/2026, Roll number: 24BIT075
import java.util.Scanner;
class numbers {
    int num1;
    int num2;
}

public class cprove {
    static void sum(numbers n) {
        int sum = n.num1 + n.num2; 
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        numbers meow = new numbers();
        System.out.print("Enter the first number: ");
        meow.num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        meow.num2 = input.nextInt();

        sum(meow);
        input.close();
    }
}
