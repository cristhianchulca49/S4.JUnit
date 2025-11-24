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
}
