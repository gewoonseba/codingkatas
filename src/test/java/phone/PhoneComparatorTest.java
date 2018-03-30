package phone;


import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class PhoneComparatorTest {

    Comparator comparator = new PhoneComparator();

    @Test
    public void compareTest(){
        assertEquals(1, comparator.compare("qwe", "rt"));
        assertEquals(-1, comparator.compare("qw", "ert"));
        assertEquals(0, comparator.compare("qwe", "rty"));
    }

}