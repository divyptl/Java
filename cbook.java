// Name: Divya Patel, Enrollment Number: 24BIT075, Date: 15/01/2026
class Book {
    String title;
    String author;
    double price;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class cbook {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Harry Potter";
        book1.author = "J.K. Rowling";
        book1.price = 400;

        Book book2 = new Book();
        book2.title = "The Diary of Whimpy Kid";
        book2.author = "Jeff Kinney";
        book2.price = 300;

        Book book3 = new Book();
        book3.title = "The Little book of Black Holes";
        book3.author = "Steven S. Gubser and Frans Pretorius";
        book3.price = 800;

        System.out.println("Displaying Book 1 Details:");
        book1.displayInfo(); 

        System.out.println("\nDisplaying Book 2 Details:");
        book2.displayInfo(); 
        
        System.out.println("\nDisplaying Book 3 Details:");
        book3.displayInfo(); 
    }
}