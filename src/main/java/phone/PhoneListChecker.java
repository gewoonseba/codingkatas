package phone;

import java.util.List;

public class PhoneListChecker {

    public Boolean isConsistent(List<String> phoneNumbers){

        if (phoneNumbers.size() <= 1) {
            return true;
        } else {
            return phoneNumbers.get(0) != phoneNumbers.get(1);
        }
    }
}
