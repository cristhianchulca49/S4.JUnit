package Level1_E1;

import Level1_E1.Exceptions.DuplicateException;

import java.util.ArrayList;
import java.util.List;

public class Bookshop {
    static List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        try {
            if (books.contains(book)) {
                throw new DuplicateException("Book already exists");
            } else {
                books.add(book);
            }
        } catch (DuplicateException e) {
            System.out.println(e.getMessage());
        }
    }
}
