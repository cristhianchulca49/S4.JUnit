package Level1_E2;

import java.util.List;

public class CalculationDNI {

    private static final List<String> LETTERS = List.of(
            "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J",
            "Z", "S", "Q", "V", "H", "L", "C", "K", "E"
    );

    public static String calculateLetter(int numberDNI) {
        if (numberDNI < 10000000 || numberDNI > 99999999) {
            throw new IllegalArgumentException("Invalid number, should be 8 digits");
        }
        int index = numberDNI % 23;
        return LETTERS.get(index);
    }
}

