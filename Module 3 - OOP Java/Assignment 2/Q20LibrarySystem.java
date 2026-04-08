class Book {
  int bookId;
  String bookName;

  Book(int id, String name) {
    bookId = id;
    bookName = name;
  }
}

class Library {
  void displayBooks(Book[] books) {
    for (int i = 0; i < books.length; i++) {
      System.out.println("Book ID: " + books[i].bookId + ", Name: " + books[i].bookName);
    }
  }
}

class Q20LibrarySystem {
  public static void main(String args[]) {

    Book b1 = new Book(1, "Java");
    Book b2 = new Book(2, "Python");
    Book b3 = new Book(3, "DBMS");

    Book[] books = {b1, b2, b3};

    Library lib = new Library();
    lib.displayBooks(books);
  }
}