//Name: Divya Patel, Date: 15/01/2026, Roll number: 24BIT075
import java.util.Scanner;

class Student {
    String name;
    String roll;
    double marks;

    void show() {
        System.out.println("Name: " + name + " ; Roll: " + roll + " ; Marks: " + marks);
    }
}

public class cdetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int count = input.nextInt();
        input.nextLine(); 

        Student[] students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student();

            System.out.print("Enter Name: ");
            students[i].name = input.nextLine();

            System.out.print("Enter Roll Number: ");
            students[i].roll = input.nextLine();

            System.out.print("Enter Marks: ");
            students[i].marks = input.nextDouble();
            input.nextLine(); 
        }
        for (int i = 0; i < count; i++) {
            students[i].show();
        }
        
        input.close();
    }
}