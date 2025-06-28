package Library.domain;

public class Library {
    private String libraryName;
    private LibrarySection[] sections;
    private int count;

    public Library(String libraryName, int maxSections) {
        this.libraryName = libraryName;
        this.sections = new LibrarySection[maxSections];
        this.count = 0;
    }

    public void addSection(LibrarySection section) {
        if (count < sections.length) {
            sections[count] = section;
            count++;
        } else {
            System.out.println("Limit reached");
        }
    }

    public void listAllBook() {
        for (LibrarySection section : sections) {
            if (section != null) {
                for (Book book : section.getBooks()) {
                    if (book.isAvailable() && book != null) {
                        System.out.println("Title: " + book.getTitle());
                    }
                }
            }
        }
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public LibrarySection[] getSections() {
        return sections;
    }

    public void setSections(LibrarySection[] sections) {
        this.sections = sections;
    }
}