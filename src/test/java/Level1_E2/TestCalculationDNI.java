package Level1_E2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculationDNI {

    @ParameterizedTest
    @CsvSource({
            "57483920,C",
            "18492755,L",
            "90321487,G",
            "45219833,Q",
            "76152409,F",
            "62841755,M",
            "39752184,L",
            "84512977,Y",
            "21645739,W",
            "68974512,L"
    })
    public void testCalculationDNI(int number, String expectedLetter) {
        assertEquals(expectedLetter, CalculationDNI.calculateLetter(number));
    }
}
