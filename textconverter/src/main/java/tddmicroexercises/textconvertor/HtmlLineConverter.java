package tddmicroexercises.textconvertor;


public class HtmlLineConverter {

    public String convert(String line) {
        String html = StringEscapeUtils.escapeHtml(line);
        html += "<br />";
        return html;
    }

}
