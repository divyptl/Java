import java.util.Scanner;
class Box {
    int length, width;
    Box(int side) {
        length = side;
        width = side;
    }
    Box(int l, int w) {
        length = l;
        width = w;
    }
    void show() {
        System.out.println("Box: " + length + " x " + width);
    }
}
public class con_3 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the square dimentions: ");
        int side = input.nextInt();
        new Box(side).show();    
        System.out.print("enter the rectangle dimentions: ");
        int l = input.nextInt();
        int w = input.nextInt();
        new Box(l, w).show(); 

        input.close();
    }
}