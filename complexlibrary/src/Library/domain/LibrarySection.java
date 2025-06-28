package Library.domain;

public class LibrarySection {
    private String sectionName;
    private Book[] books;
    private int bookCount;
    public LibrarySection(String sectionName, int maxBooks) {
        this.sectionName = sectionName;
        this.books = new Book[maxBooks];
        this.bookCount = 0;
    }

    public void listAvailableBooks(){
        for (Book book : books) {
        if (book.isAvailable()){
            System.out.println(" Available books: "+ book.getTitle());
        }
        }
    }

    public void addBook(Book book){
        if (bookCount < books.length){
            books[bookCount] = book; // bookCount tells us where to place the book in the array.
                                    // Initially, bookCount is 0, because no books have been added yet,
                                    // so the first book will go to the first position (books[0]).
                                    // book is the obj from the class Book to store in the array at
                                                                //the position indicated by bookCount
            bookCount++;

            System.out.println("The book: "+ book.getTitle()+ " added to the section: "+ getSectionName());
        } else {
            System.out.println("No space to add more books in this section");
        }
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
