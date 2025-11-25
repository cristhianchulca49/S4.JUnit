package Level1_E3;

import java.util.ArrayList;
import java.util.List;

public class Month {
    private List<String> months = new ArrayList();

    public Month() {
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }

    public String getMonth(int index) {
        if(index < 0 || index >= months.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + months.size());
        }
        return months.get(index-1);
    }
}
