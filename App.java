//Name: Divya Patel, Date: 08/01/2026, Roll number: 24BIT075
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.:");
        int n = sc.nextInt();
        if((n%2)==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}
