package Level1_E2;

import java.util.ArrayList;
import java.util.List;

public class CalculationDNI {

    private List<String> letter = new ArrayList<>();

    public CalculationDNI() {
        letter.add("T");
        letter.add("R");
        letter.add("W");
        letter.add("A");
        letter.add("G");
        letter.add("M");
        letter.add("Y");
        letter.add("F");
        letter.add("P");
        letter.add("D");
        letter.add("X");
        letter.add("B");
        letter.add("N");
        letter.add("J");
        letter.add("Z");
        letter.add("S");
        letter.add("Q");
        letter.add("V");
        letter.add("H");
        letter.add("L");
        letter.add("C");
        letter.add("K");
        letter.add("E");
    }

    public String calculateLetter(int numberDNI) {
        if (numberDNI < 9999999) {
            throw new IllegalArgumentException("Invalid number, should be 8 digits");
        }
        int index = numberDNI % 23;
        return letter.get(index);
    }
}

