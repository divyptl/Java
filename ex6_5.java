import java.util.Scanner;
class Course
{
	String courseName;
	String courseCode;

	Course(String courseName, String courseCode) 
	{
        	this.courseName = courseName;
        	this.courseCode = courseCode;
    	}

	void display() 
	{
        	System.out.println("Course Name: " + courseName);
        	System.out.println("Course Code: " + courseCode);
	}
}


public class ex6_5
{
    public static void main(String[] args) 
{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String cname = input.nextLine();

        System.out.print("Enter Course Code: ");
        String code = input.nextLine();

        Course obj1 = new Course(cname, code);
        obj1.display();
    }
}