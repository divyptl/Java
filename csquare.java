//Name: Divya Patel, Date: 15/01/2026, Roll number: 24BIT075
import java.util.Scanner;
public class csquare {
    int n;
    int square(int n){
        return n*n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        csquare s = new csquare();

        System.out.print("Enter the number:");
        s.n = input.nextInt();
        System.out.println(s.square(s.n));

        input.close();
    }
}