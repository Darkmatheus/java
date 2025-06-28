package Library.test;

import Library.domain.Book;
import Library.domain.Library;
import Library.domain.LibrarySection;
import Library.domain.User;


public class LibraryTest {
    public static void main(String[] args) {

        Book[] loanSpace = new Book[2];

        User user1 = new User("Saint", "999#", loanSpace);
        User user2 = new User("Clement", "998#", loanSpace);

        Book book1 = new Book("The Witcher", "Andrzej Sapkowski", true);
        Book book2 = new Book("Little Prince", "Antoine de Saint-Exupéry", true);
        Book book3 = new Book("3 Pigs", "George", false);

        LibrarySection section1 = new LibrarySection("Best Sellers", 3);
        section1.addBook(book1);
        section1.addBook(book2);
        section1.addBook(book3);

        Library library = new Library("Central library", 2);
        library.addSection(section1);


        System.out.println("\nAvailable books: ");
        library.listAllBook();
        System.out.println();


        user1.borrowBook(book1);
        user2.borrowBook(book2);
        user2.borrowBook(book3);


        System.out.println("\nBorrowed books by: " + user1.getName() + user1.getUserID() +":");
        for (Book book : user1.getBorrowedBooks()) {
            if (book != null) {
                System.out.println(book.getTitle());
            }
        }
        System.out.println("\nBorrowed books by: " + user2.getName() + user2.getUserID() +":");
        for (Book book : user2.getBorrowedBooks()) {
            if (book != null) {
                System.out.println(book.getTitle());
            }
        }

        user2.returnBook(book3);

        System.out.println("Available books after return:");
        library.listAllBook();
    }
}
