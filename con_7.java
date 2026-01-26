//Name: Divya Patel, Enrollment Number: 24BIT075, Date: 22/01/2026
import java.util.Scanner;
class try1 {
    int x; 
    try1(int x){
        this.x = x;
    }
}
public class con_7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        try1 obj = new try1(num);
        System.out.print(obj.x);
        input.close();
    }
}