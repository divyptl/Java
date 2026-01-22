class try1 {
    int x; 
    try1(int x){
        this.x = x;
    }
}
public class con_7{
    public static void main(String[] args) {
        try1 obj = new try1(5);
        System.out.print(obj.x);
    }
}