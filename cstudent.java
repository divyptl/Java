// Name: Divya Patel, Enrollment Number: 24BIT075, Date: 15/01/2026
import java.util.Scanner;
class Student {
    String name;
    String rollno;
}
public class cstudent {
    void display(Student cd) {
        System.out.println("Name: " + cd.name);
        System.out.println("Roll Number: " + cd.rollno);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student cd = new Student();
        cstudent cd1 = new cstudent();

        System.out.print("enter the name:");
        cd.name = sc.nextLine();

        System.out.print("enter the roll number: ");
        cd.rollno = sc.nextLine();

        cd1.display(cd);
        sc.close();
    }
}
