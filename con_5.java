//Name: Divya Patel, Enrollment Number: 24BIT075, Date: 22/01/2026
import java.util.Scanner;
class Sandesh {
    String meow;
    Sandesh(String t) {
        meow = t;
    }
    void display() {
        System.out.println("Sandesh: " + meow);
    }
}
public class con_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sandesh likhiye: ");
        String t = input.nextLine();
        Sandesh msg = new Sandesh(t);
        msg.display();
        input.close();
    }
}