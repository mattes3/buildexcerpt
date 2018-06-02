package de.mbohlen.buildexcerpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        OpenGraphParser ogp = new OpenGraphParser();
        ExcerptFormatter formatter = new ExcerptFormatter();

        List<OpenGraphParser.Result> pages = Arrays.stream(args).map(ogp::parse).collect(Collectors.toList());

        String excerpt = formatter.buildExcerpts(pages);
        System.out.print(excerpt);
    }
}
