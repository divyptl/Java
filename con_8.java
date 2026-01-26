//Name: Divya Patel, Enrollment Number: 24BIT075, Date: 22/01/2026
import java.util.Scanner;
class Employee {
    int id , salary;
    Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class con_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();
        System.out.print("Enter Employee Salary: ");
        int salary = input.nextInt();
        Employee emp = new Employee(id, salary);
        emp.display();
        input.close();
    }
}