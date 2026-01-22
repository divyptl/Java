//Name: Divya Patel, Date: 15/01/2026, Roll number: 24BIT075
import java.util.Scanner;
class check {
    String check_num(int n) {
        String result = (n % 2 == 0) ? "even" : "odd";
        return result;
    }
}

public class ccheck {
    public static void main(String[] args) {
        check x = new check();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        String result = x.check_num(num);

        System.out.println("Number is " + result);
        input.close();
    }
}