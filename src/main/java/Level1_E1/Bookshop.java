package Level1_E1;

import java.util.*;

public class Bookshop {
    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Set<Book> getBooks() {
        return Collections.unmodifiableSet(books);
    }

    public String getBookTitleByIndex(int index) {
        if (index <= 0 || index > books.size()) {
            return null;
        }
        List<Book> bookList = new ArrayList<>(books);
        return bookList.get(index-1).getTitle();
    }
}