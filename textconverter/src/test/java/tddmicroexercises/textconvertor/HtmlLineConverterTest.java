package tddmicroexercises.textconvertor;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HtmlLineConverterTest {

    private static final String TEST_LINE = "some test input & < > \" '";

    HtmlLineConverter converter = new HtmlLineConverter();

    @Test
    public void convert(){
        assertEquals("some test input &amp; &lt; &gt; &quot; &quot;<br />", converter.convert(TEST_LINE));
    }

}