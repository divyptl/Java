//Name: Divya Patel, Date: 08/01/2026, Roll number: 24BIT075
import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1; i<n; i++){
            System.out.println(i*i);
        }
        sc.close();
}
}