class Employee
{
    int emp_id;
    String name;
    String department;
    private double salary;
    static int totalEmployees = 0;

	public Employee()
	{
		this.emp_id = 10;
		this.name = "Piyu(Name given without arguments)";
		this.department = "MECH";
		this.salary = 13345.99;
		totalEmployees++;
    	}

    public Employee(int emp_id, String name, String department, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public static void displaytotal() {
        System.out.println("Total Employees Count: " + totalEmployees);
    }

    public double calculateSalary() {
        return this.salary;
    }

    public String calculateSalary(double bonus) {
        double total = this.salary + bonus;
        return "Salary with bonus: " + total;
    }

    public void displayinfo() {
        System.out.println("ID: " + this.emp_id);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Base Salary: " + this.salary);
    }
}

public class ex6_6 {
    public static void main(String[] args) {
        System.out.println("Default Constructor");
        Employee emp1 = new Employee();
        emp1.displayinfo();

        System.out.println("Parameterized Constructor");
        Employee emp2 = new Employee(75, "Divy", "ICT", 75000.50);
        emp2.displayinfo();

        Employee.displaytotal();

        System.out.println("Salary for " + emp1.name + ": " + emp1.calculateSalary());
        System.out.println("Salary for " + emp2.name + ": " + emp2.calculateSalary());

        double baseSal = emp2.calculateSalary(); 
        System.out.println("Base (double return): " + baseSal);
        
        String withBonus = emp2.calculateSalary(5000.0); 
        System.out.println("With Bonus (String return): " + withBonus);
    }
}