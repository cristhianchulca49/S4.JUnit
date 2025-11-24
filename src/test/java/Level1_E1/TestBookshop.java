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

    @Test
    void testNoDuplicates() {
        Book duplicate = new Book("Book 1", "Author 1");
        bookshop.addBook(duplicate);
        assertAll(
                () -> assertEquals(1, bookshop.getBooks().size(), "Bookshop should not allow duplicate books"),
                () -> assertTrue(bookshop.getBooks().contains(book), "Bookshop should already contain Book 1")
        );
    }

    @Test
    void testGetTitleBookByIndex() {
        assertEquals("Book 1", bookshop.getBookTitleByIndex(1));
    }

    @Test
    void testRemoveBookByTitle() {
        bookshop.removeBookByTitle("Book 1");

        assertAll(
                () -> assertTrue(bookshop.getBooks().isEmpty(), "Bookshop should be empty after removing the only book"),
                () -> assertFalse(bookshop.getBooks().contains(book), "Bookshop should not contain Book 1")
        );
    }

    @Test
    void testAlphabeticalOrder() {
        bookshop.addBook(new Book("Z", "Author 1"));
        bookshop.addBook(new Book("F", "Author 2"));
        bookshop.addBook(new Book("B", "Author 3"));
        bookshop.addBook(new Book("A", "Author 4"));
        bookshop.removeBookByTitle("F");

        assertAll(
                () -> assertEquals("A", bookshop.getBookTitleByIndex(1), "The first book should be A"),
                () -> assertEquals("Z", bookshop.getBookTitleByIndex(bookshop.getBooks().size()), "The last book should be Z")
        );
    }
}
