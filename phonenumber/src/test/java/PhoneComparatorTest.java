package phone;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PhoneComparatorTest {

    Comparator comparator = new PhoneComparator();

    @Test
    public void compareTest(){
        assertEquals(1, comparator.compare("qwe", "rt"));
        assertEquals(-1, comparator.compare("qw", "ert"));
        assertEquals(0, comparator.compare("qwe", "rty"));
    }

    @Test
    public void sortTest(){
        List<String> testList = Arrays.asList("a", "bcd", "ef", "");
        List<String> expected = Arrays.asList("", "a", "ef", "bcd");
        Collections.sort(testList, comparator);
        assertEquals(expected,testList);
    }

}