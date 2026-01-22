//Name: Divya Patel, Date: 15/01/2026, Roll number: 24BIT075
import java.util.Scanner;

class data{
    int n1;
    int n2;
    int sum;
}
public class csecond {

    public static void main(String[] args) {
        data data = new data();
        Scanner input = new Scanner(System.in);

        System.out.print("enter first number: ");
        data.n1 = input.nextInt();

        System.out.print("enter second number: ");
        data.n2 = input.nextInt();

        data.sum = data.n1 + data.n2;
        System.out.println("total sum: " + data.sum);
        input.close();
    }
}
