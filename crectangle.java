// Name: Divya Patel, Enrollment Number: 24BIT075, Date: 15/01/2026
import java.util.Scanner;

class Dim{
    int breadth;
    int length;
    int area;
}

public class crectangle{
    void display(Dim cd) {
        System.out.println("Length: " + cd.length + " Breadth: " + cd.breadth);
        System.out.println("Area: " + cd.area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dim cd = new Dim();
        crectangle cd1 = new crectangle();

        System.out.print("Enter the length: ");
        cd.length = sc.nextInt();
        System.out.print("Enter the breadth: ");
        cd.breadth = sc.nextInt();

        cd.area = cd.length*cd.breadth;
        cd1.display(cd);

        sc.close();
    }
}
