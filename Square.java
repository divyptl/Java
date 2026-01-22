public class Square { 
void printSquares() { 
for(int i = 1; i <= 5; i++) { 
System.out.print(i * i + " "); 
} 
} 
public static void main(String[] args) throws Exception { 
Square obj = new Square(); 
obj.printSquares(); 
} 
}