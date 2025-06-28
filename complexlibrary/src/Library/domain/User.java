package Library.domain;

public class User {
    private String name;
    private String userID;
    private Book[] borrowedBooks;
    private int count;

    public User(String name, String userID, Book[] borrowedBooks) {
        this.name = name;
        this.userID = userID;
        this.borrowedBooks = new Book[5];
        this.count = 0;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            if (count < borrowedBooks.length) {
                borrowedBooks[count] = book;
                count++;
                book.setAvailable(false);
                System.out.println(name + " borrowed the book: " + book.getTitle());
            } else {
                System.out.println("Borrowing limit reached!");
            }
        } else {
            System.out.println("The book " + book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] == book){
                borrowedBooks[i] = null;
                count--;
                book.setAvailable(true);
                System.out.println(name + " returned the book: " + book.getTitle());
                break;
            }
        }
    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
