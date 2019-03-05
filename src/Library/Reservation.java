package Library;

import java.util.Date;

public class Reservation {

    private Book book;
    private User user;
    private Date startDate;
    private Date endDate;



    public Reservation(User user, Book book, Date startDate, Date endDate) {
        this.user = user;
        this.book = book;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
