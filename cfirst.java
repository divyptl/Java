//Name: Divya Patel, Date: 15/01/2026, Roll number: 24BIT075
import java.util.Scanner;

public class cfirst {

    int n1;
    int n2;
    int sum;

    public static void main(String[] args) {
        cfirst cd = new cfirst();
        Scanner input = new Scanner(System.in);

        System.out.print("enter first number: ");
        cd.n1 = input.nextInt();

        System.out.print("enter second number: ");
        cd.n2 = input.nextInt();

        cd.sum = cd.n1 + cd.n2;
        System.out.println("total sum: " + cd.sum);
        input.close();
    }
}
