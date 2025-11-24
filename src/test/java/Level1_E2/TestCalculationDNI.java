package Level1_E2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculationDNI {

    @Test
    public void testCalculationDNI() {
        CalculationDNI calculationDNI = new CalculationDNI();
        assertEquals("Z", calculationDNI.calculateLetter(12345678));
    }
}
