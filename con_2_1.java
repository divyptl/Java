//Name: Divya Patel, Enrollment Number: 24BIT075, Date: 22/01/2026
import java.util.Scanner;
class Add {
    int n1, n2;
    Add(int a, int b) {
        n1 = a;
        n2 = b;
    }
    void display() {
        System.out.println("The sum is: " + (n1 + n2));
    }
}
public class con_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        System.out.print("Enter second number: ");
        int y = input.nextInt();
        Add obj = new Add(x, y);
        obj.display();
        input.close();
    }
}