//Name: Divya Patel, Enrollment Number: 24BIT075, Date: 22/01/2026
import java.util.Scanner;
class With{
    int id;
    With(int i) {
        this.id = i;
    }
    void display() {
        System.out.println("ID (Constructor): " + id);
    }
}
class Without {
    int id;
    void setValues(int i) {
        this.id = i;
    }
    void display() {
        System.out.println("ID (Method): " + id);
    }
}
public class con_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID for Customer:");
        int id1 = input.nextInt();
        With obj1 = new With(id1); 
        obj1.display();
        Without obj2 = new Without(); 
        obj2.setValues(id1);
        obj2.display();
        input.close();
    }
}