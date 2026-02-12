import java.util.Scanner;
class Overloading 
{
	int Sum(int a, int b)
	{
		return (a+b);
	}

	int Sum(int a, int b, int c)
	{
		return (a+b+c);
	}
}

public class ex6_1
{
	public static void main(String[] args)
	{
		Overloading obj1 = new Overloading();
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Enter the total number: ");
		int n = input.nextInt();
		
		if(n==3){
		System.out.println("Enter the numbers: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		System.out.println("Output: " + obj1.Sum(a,b,c));
		}
		
		else if(n==2){
		System.out.println("Enter the numbers: ");
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("Output: " + obj1.Sum(a,b));
		}
	}
}
