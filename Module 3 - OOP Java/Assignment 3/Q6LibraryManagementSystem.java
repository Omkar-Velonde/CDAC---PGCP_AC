import java.util.*;

// Book Class
class Book {
    int id;
    String title, author;
    boolean isAvailable;

    static int totalBooks = 0;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;   // default available
        totalBooks++;
    }

    // Issue Book
    void issueBook() {
        if (!isAvailable) {
            System.out.println("Book already issued!");
        } else {
            isAvailable = false;
            System.out.println("Book issued successfully.");
        }
    }

    // Return Book
    void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }

    void display() {
        System.out.println("ID: " + id + ", Title: " + title + 
                           ", Author: " + author + 
                           ", Status: " + (isAvailable ? "Available" : "Issued"));
    }
}

class Q6LibraryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Input books
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter book " + (i + 1) + " details:");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            list.add(new Book(id, title, author));
        }

        // Issue first book
        if (!list.isEmpty()) {
            list.get(0).issueBook();
        }

        // Return first book
        if (!list.isEmpty()) {
            list.get(0).returnBook();
        }

        // Display all books
        System.out.println("\n--- All Books ---");
        for (Book b : list) {
            b.display();
        }

        // Display available & issued separately
        System.out.println("\n--- Available Books ---");
        for (Book b : list) {
            if (b.isAvailable) b.display();
        }

        System.out.println("\n--- Issued Books ---");
        for (Book b : list) {
            if (!b.isAvailable) b.display();
        }

        System.out.println("\nTotal Books: " + Book.totalBooks);
    }
}