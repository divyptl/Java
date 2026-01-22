//Name: Divya Patel, Enrollment Number: 24BIT075, Date: 08/01/2026
import java.util.Scanner;
public class second{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number");
        int n2 = sc.nextInt();
        int add = n1 + n2; 
        System.out.println("The sum of 2 numbers is " + add);
        sc.close();
    }
}