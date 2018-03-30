package phone;

import java.util.List;

public class PhoneListChecker {

    public Boolean isConsistent(List<String> phoneNumbers){
        return phoneNumbers.size() <= 1;
    }
}
