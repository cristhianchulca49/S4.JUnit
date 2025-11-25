package Level1_E3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMonth {
    @Test
    public void testMonthThrowsException() {
        Month month = new Month();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            month.getMonth(99);
        });
    }
}
