//Name: Divya Patel, Enrollment Number: 24BIT075, Date: 08/01/2026
import java.util.Scanner;
public class AdditionProgram {
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int result = addNumbers(number1, number2);
        System.out.println("The sum is: " + result);
        scanner.close();
    }
}