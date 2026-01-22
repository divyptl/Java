import java.util.Scanner;

class Default {
    int x;
    Default(int y) {
        x = y; 
        System.out.println("Parameterized Constructor called with value: " + y);
    }
}

public class con_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int z = input.nextInt();
        
        Default obj = new Default(z);
        System.out.println("Value of obj.x is: " + obj.x);
        
        input.close();
    }
}