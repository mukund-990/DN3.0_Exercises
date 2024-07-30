public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Book 1", "Author 1");
        Book book2 = new Book(2, "Book 2", "Author 2");
        Book book3 = new Book(3, "Book 3", "Author 3");

        Book[] books = {book1, book2, book3};
        Library library = new Library(books);
        LibrarySearch librarySearch = new LibrarySearch(books);

        Book searchedBookLinear = library.linearSearchByTitle("Book 2");
        if (searchedBookLinear != null) {
            System.out.println("Searched Book (Linear Search):");
            System.out.println("Book ID: " + searchedBookLinear.getBookId() + ", Title: " + searchedBookLinear.getTitle() + ", Author: " + searchedBookLinear.getAuthor());
        } else {
            System.out.println("Book not found (Linear Search).");
        }

        Book searchedBookBinary = librarySearch.binarySearchByTitle("Book 2");
        if (searchedBookBinary != null) {
            System.out.println("Searched Book (Binary Search):");
            System.out.println("Book ID: " + searchedBookBinary.getBookId() + ", Title: " + searchedBookBinary.getTitle() + ", Author: " + searchedBookBinary.getAuthor());
        } else {
            System.out.println("Book not found (Binary Search).");
        }
    }
}