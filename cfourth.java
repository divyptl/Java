//Name: Divya Patel, Enrollment Number: 24BIT075, Date: 15/01/2026
import java.util.Scanner;
class App1{
    int dis(int a, int b){
        return a+b;
    }
}
public class cfourth
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        App1 cd = new App1();

        System.out.print("Enter the first number");
        int a = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
        
        System.out.print(cd.dis(a, b));
        sc.close();
    }
}