package phone;

import java.util.Comparator;

public class PhoneComparator implements Comparator<String> {

    public int compare(String phone1, String phone2) {
        return phone1.length() - phone2.length();
    }
}
