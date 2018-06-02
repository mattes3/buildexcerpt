package de.mbohlen.buildexcerpt;

import com.mscharhag.et.ET;
import com.mscharhag.et.ExceptionTranslator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class OpenGraphParser {

    private final ExceptionTranslator et = ET.newConfiguration().done();

    public static class Result {
        public String title;
        public String imageUrl;
        public String description;
        public String url;

        public Result(String title, String imageUrl, String description, String url) {
            this.title = title;
            this.imageUrl = imageUrl;
            this.description = description;
            this.url = url;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "title='" + title + '\'' +
                    ", imageUrl='" + imageUrl + '\'' +
                    ", description='" + description + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    public Result parse(String url) {
        return et.withReturningTranslation(() -> {
            Document doc = Jsoup.connect(url).get();

            String title = extractMeta(doc, "og:title");
            String imageUrl = extractMeta(doc, "og:image");
            String description = extractMeta(doc, "og:description");
            String url2 = extractMeta(doc, "og:url");

            return new Result(title, imageUrl, description, url2);
        });
    }

    private String extractMeta(Document doc, String tagName) {
        Elements elements = doc.select("meta[property=" + tagName + "]");
        if (!elements.isEmpty()) {
            return elements.get(0).attr("content");
        }
        return null;
    }
}
