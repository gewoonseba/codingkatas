package phone;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PhoneListCheckerTest {

    PhoneListChecker checker = new PhoneListChecker();

    @Test
    public void isConsistentTest_Consistent(){
        List<String> phoneList = new ArrayList();
        phoneList.add("911");

        assertEquals(true, checker.isConsistent(phoneList));
    }

}