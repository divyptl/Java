import java.util.Scanner;

class Overloading 
{
    float Sub(int a, float b)
    {
        return (a + b); 
    }
    float Sub(float a, int b)
    {
        return (a - b);
    }
}

public class ex6_3
{
    public static void main(String[] args)
    {
        Overloading obj1 = new Overloading();
        Scanner input = new Scanner(System.in);
        
        int a; 
        float b;
        
        System.out.println("Enter the numbers: ");
        a = input.nextInt();
        b = input.nextFloat();
        
        System.out.println("Output (int, float): " + obj1.Sub(a, b));
        
        System.out.println("Output (float, int): " + obj1.Sub(b, a)); 
    }
}