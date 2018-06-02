package de.mbohlen.buildexcerpt;

import org.junit.Test;

import static org.junit.Assert.*;

public class OpenGraphParserTest {

    @Test
    public void shouldParseJustAskUsers() {
        OpenGraphParser ogp = new OpenGraphParser();
        OpenGraphParser.Result result = ogp.parse("https://justaskusers.com/");
        System.out.println(result);
        assertNotNull(result.description);
        assertNotNull(result.imageUrl);
        assertNotNull(result.title);
        assertNotNull((result.url));
    }
}