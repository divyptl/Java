class Default{
    Default(){
        System.out.println("Default Constructor");
    }
    int x;
}
public class con_2 {
    
public static void main(String[] args) {
        Default obj = new Default();
        obj.x = 10; 
        System.out.print(obj.x);
    }
}