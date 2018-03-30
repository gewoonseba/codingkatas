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

    private Boolean checkConsistency(List<String> phoneNumbers){
        if (hasDuplicates(phoneNumbers)) {
            return false;
        } else {
            return hasPrefixes(phoneNumbers);
        }
    }

    private Boolean hasPrefixes(List<String> phoneNumbers) {
        HashSet<String> checked = new HashSet<String>();
        return false;
    }

    private Boolean hasDuplicates(List<String> phoneNumbers){
        Set<String> uniqueNumbers = new HashSet<String>(phoneNumbers);
        return uniqueNumbers.size() == phoneNumbers.size();
    }
}
