package Level1_E1;

import java.util.Set;
import java.util.TreeSet;

public class Bookshop {
    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book) {
        books.add(book);
    }

}
