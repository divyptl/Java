//Name: Divya Patel, Enrollment Number: 24BIT075, Date: 08/01/2026
import java.util.Scanner;
public class fourth{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            System.out.print(i+ ".");
        }
        sc.close();
    }
}