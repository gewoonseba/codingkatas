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
        phoneList.add("234");

        assertEquals(true, checker.isConsistent(phoneList));
    }

    @Test
    public void isConsistentTest_NotConsistent_Duplicate(){
        List<String> phoneList = new ArrayList();
        phoneList.add("911");
        phoneList.add("123");
        phoneList.add("678");
        phoneList.add("123");

        assertEquals(false, checker.isConsistent(phoneList));
    }

    @Test
    public void isConsistentTest_NotConsistent_Prefix(){
        List<String> phoneList = new ArrayList();
        phoneList.add("911");
        phoneList.add("123");
        phoneList.add("1234");

        assertEquals(false, checker.isConsistent(phoneList));
    }

}