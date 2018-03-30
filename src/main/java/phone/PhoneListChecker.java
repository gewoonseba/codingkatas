package phone;

import java.util.*;

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
            return ! hasPrefixes(phoneNumbers);
        }
    }

    private Boolean hasPrefixes(List<String> phoneNumbers) {
        HashSet<String> checked = new HashSet<String>();
        Collections.sort(phoneNumbers, new PhoneComparator());
        for (String phoneNumber : phoneNumbers){
            if (containsAnotherPhoneNumber(phoneNumber, checked)){
                return true;
            } else {
                checked.add(phoneNumber);
            }
        }
        return false;
    }

    private Boolean hasDuplicates(List<String> phoneNumbers){
        Set<String> uniqueNumbers = new HashSet<String>(phoneNumbers);
        return uniqueNumbers.size() != phoneNumbers.size();
    }

    private Boolean containsAnotherPhoneNumber(String phoneNumber, HashSet<String> checked) {
        for(String checkedPhoneNumber : checked){
            return phoneNumber.startsWith(checkedPhoneNumber);
        }
        return false;
    }
}
