//Name: Divya Patel, Enrollment Number: 24BIT075, Date: 22/01/2026
import java.util.Scanner;
class newdata {
    String name1;
    int number;
    newdata(String name2, int roll) {
        name1 = name2;
        number = roll;
    }
    void display() {
        System.out.println("Student Name: " + name1 + ", Roll Number: " + number);
    }
}
public class con_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String x = input.nextLine();
        System.out.print("Enter Roll Number: ");
        int y = input.nextInt();
        newdata obj = new newdata(x, y);
        obj.display();
        input.close();
    }
}