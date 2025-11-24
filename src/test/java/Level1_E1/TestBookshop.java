package Level1_E1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBookshop {
    Book book;
    Bookshop bookshop;

    @BeforeEach
    public void setUp() {
        book = new Book("Book 1", "Author 1");
        bookshop = new Bookshop(book);
    }

    @Test
    void testNullBookshop() {
        assertAll(
                () -> assertFalse(bookshop.getBooks().isEmpty()),
                () -> assertNotNull(bookshop.getBooks())
        );
    }

    @Test
    void testAddBook() {
        Book book2 = new Book("Book 2", "Author 2");
        bookshop.addBook(book2);
        assertTrue(bookshop.getBooks().contains(book2), "Bookshop should contain Book 2");
    }

    @Test
    void testSizeBookshop() {
        Book book2 = new Book("Book 2", "Author 2");
        Book book3 = new Book("Book 3", "Author 3");
        bookshop.addBook(book2);
        bookshop.addBook(book3);
        assertEquals(3, bookshop.getBooks().size(), "Bookshop should contain 3 books");
    }
}
