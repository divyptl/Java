import java.util.Scanner;
class Overloading 
{
	double Sum(int a, float b)
	{
		return (a+b);
	}

	double Sum(int a, float b, double c)
	{
		return (a+b+c);
	}
}

public class ex6_2
{
	public static void main(String[] args)
	{
		Overloading obj1 = new Overloading();
		Scanner input = new Scanner(System.in);
		
		int a; 
		float b; 
		double c;
		System.out.println("Enter the total number: ");
		int n = input.nextInt();
		
		if(n==3){
		System.out.println("Enter the numbers: ");
		a = input.nextInt();
		b = input.nextFloat();
		c = input.nextDouble();
		System.out.println("Output: " + obj1.Sum(a,b,c));
		}
		
		else if(n==2){
		System.out.println("Enter the numbers: ");
		a = input.nextInt();
		b = input.nextFloat();
		System.out.println("Output: " + obj1.Sum(a,b));
		}
	}
}
