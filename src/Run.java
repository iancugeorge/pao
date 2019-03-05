import Library.Book;
import Library.LibraryService;

public class Run {

    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();

        Book[] booksThatExist = libraryService.listAll();
        for (Book book: booksThatExist
             ) {
            System.out.println(book.getId() + " - " + book.getTitle());
        }
    }
}
