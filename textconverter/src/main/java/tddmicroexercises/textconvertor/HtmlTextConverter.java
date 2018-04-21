package tddmicroexercises.textconvertor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HtmlTextConverter
{
    private String fullFilenameWithPath;
    private HtmlLineConverter lineConverter = new HtmlLineConverter();

    public HtmlTextConverter(String fullFilenameWithPath)
    {
        this.fullFilenameWithPath = fullFilenameWithPath;
    }

    public String convertToHtml() throws IOException{
    
	    BufferedReader reader = new BufferedReader(new FileReader(fullFilenameWithPath));
	    
	    String line = reader.readLine();
	    String html = "";
	    while (line != null)
	    {
	    	html += lineConverter.convert(line);
	    	line = reader.readLine();
	    }
	    return html;

    }

	public String getFilename() {
		return this.fullFilenameWithPath;
	}
}
