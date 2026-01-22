//Name: Divya Patel, Date: 15/01/2026, Roll number: 24BIT075
import java.util.Scanner;
public class cthird {
    int add(int a, int b){
            return a + b;
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        cthird sum = new cthird();

        System.out.print("enter first number: ");
        int n1 = input.nextInt();
        System.out.print("enter second number: ");
        int n2 = input.nextInt();

        System.out.println(sum.add(n1, n2));
        input.close();
    }
}
