package Level1_E1;

import java.util.*;

public class Bookshop {
    private Set<Book> books = new TreeSet<>();

    public Bookshop(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book can be null");
        }
        books.add(book);
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book can be null");
        }
        books.add(book);
    }

    public Set<Book> getBooks() {
        return Collections.unmodifiableSet(books);
    }

    public String getBookTitleByIndex(int index) {
        if (index <= 0 || index > books.size()) {
            throw new IllegalArgumentException("Index out of bounds!");
        }
        List<Book> bookList = new ArrayList<>(books);
        return bookList.get(index - 1).getTitle();
    }

    public void removeBookByTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty!");
        }
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }
}