// Name: Divya Patel, Enrollment Number: 24BIT075, Date: 15/01/2026
import java.util.Scanner;
public class cnumber {
    int n; 
    void check(int n){
            if(n>0){
                System.out.println("positive");
            }
            else if(n<0){
                System.out.println("negative");
            }
            else{
                System.out.println("zero");
            }
        }
    public static void main(String[] args)throws Exception{
        
        Scanner input = new Scanner(System.in);
        cnumber num = new cnumber();

        System.out.print("enter a number: ");
        num.n = input.nextInt();
        num.check(num.n);

        input.close();
    }
}
