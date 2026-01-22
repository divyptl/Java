
public class con_1 {
    int x; 
    con_1(){
        System.out.println("Default Constructor");

    }
    public static void main(String[] args) {
        con_1 obj = new con_1();
        System.out.print("Hello");
        obj.x = 10;
        System.out.print(obj.x);
    }
}