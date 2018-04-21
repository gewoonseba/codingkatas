package tddmicroexercises.textconvertor;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class HtmlTextConverterTest {

    private static final String TEST_PATH = "/Users/sebastian.stoelen/Documents/workspace/codingkatas/textconverter/src/main/resources/testinput.txt";

    @Test
    public void convert() throws IOException {
        HtmlTextConverter converter = new HtmlTextConverter(TEST_PATH);
        assertEquals(TEST_PATH, converter.getFilename());
        assertEquals("some test input &amp; &lt; &gt; &quot; &quot;<br />", converter.convertToHtml());
    }
}
