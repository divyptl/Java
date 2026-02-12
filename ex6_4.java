public class ex6_4
{
    String name;
    ex6_4()
	{
        	name = "Constructor without argument";
    	}
    ex6_4(String n) 
	{
        	name = n;
    	}

    public static void main(String[] args) 
	{
        ex6_4 s1 = new ex6_4();      
        ex6_4 s2 = new ex6_4("Divy"); 

        System.out.println("Student 1: " + s1.name);
        System.out.println("Student 2: " + s2.name);
    }
}