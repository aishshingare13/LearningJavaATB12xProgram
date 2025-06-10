package Tasks.Task29.Constrcutor_Programs;

public class Book {
    private String title;
    private String author;
    private double price;

    //Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Method to display book info
    public void displayBookInfo(){
        System.out.println("Book details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        //create book object
        Book b1 = new Book("The candidate","Anirudh Bhattacharya",652.0);
        Book b2 = new Book("Warrior State","T V paul",550.0);

        //display book information
        b1.displayBookInfo();
        b2.displayBookInfo();
    }
}
