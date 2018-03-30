package phone;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhoneListChecker {

    public Boolean isConsistent(List<String> phoneNumbers){

        if (phoneNumbers.size() <= 1) {
            return true;
        } else {
            return checkConsistency(phoneNumbers);
        }
    }

    public Boolean checkConsistency(List<String> phoneNumbers){
        Set<String> uniqueNumbers = new HashSet<String>(phoneNumbers);
        return uniqueNumbers.size() == phoneNumbers.size();
    }
}
