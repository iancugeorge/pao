package Library;

import java.util.Date;

public class LibraryService {

    public static int currentIndex = 0;

    Reservation[] reservations;
    private User[] users = new User[]{
            new User(1,"Nume1"),
            new User(2,"Nume2"),
            new User(3,"Nume3")
    };
    private Book[] books = new Book[]{
            new Book(1, "Titlu1", "Autor1"),
            new Book(2, "Titlu2", "Autor2"),
            new Book(3, "Titlu3", "Autor3")
    };

    public Book[] listAll() {
        return books;
    }

    public int existsByTitle(String title) {
        return -1;
    }


    public void addReservation(int userId, int bookId, Date endDate)
    {
        User user = getUserById(userId);
        Book book = getBookById(bookId);
        Date startDate = new Date();

        Reservation reservation = new Reservation(user, book, startDate, endDate);
        reservations [currentIndex] = reservation;
        currentIndex++;
    }

    private User getUserById(int userId) {
        User selectedUser = null;
        for (User user : users) {
            if(userId == user.getId())
            {
                selectedUser = user;
            }
        }
        return selectedUser;
    }

    private Book getBookById(int id) {
        Book selectedBook = null;
        for (Book book : books) {
            if (id == book.getId()) {
                selectedBook = book;
            }
        }
        return selectedBook;
    }



}
