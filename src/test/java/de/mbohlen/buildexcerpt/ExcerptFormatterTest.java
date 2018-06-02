package de.mbohlen.buildexcerpt;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class ExcerptFormatterTest {

    @Test
    public void shouldbuildExcerpt() {
        ExcerptFormatter ef = new ExcerptFormatter();

        String title = "Just Ask Users – Plan, manage and make sense of UX research work";
        String imageUrl = "https://justaskusers.com/wp-content/uploads/2018/03/jau-twitter-imageUrl.png";
        String description = "The tool for User Experience Researchers: Curate meaningful collections of user feedback, get insights and connect them to product decisions – UX research minus the mess!";
        String url = "https://justaskusers.com/";

        String res = ef.buildExcerpts(Collections.singletonList(new OpenGraphParser.Result(
                title, imageUrl, description, url
        )));

        assertNotNull(res);
        assertNotEquals("Hello World", res);
    }
}