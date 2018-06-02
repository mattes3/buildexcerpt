package de.mbohlen.buildexcerpt;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;

import java.util.List;

public class ExcerptFormatter {

    public String buildExcerpts(List<OpenGraphParser.Result> buildData) {
        JtwigTemplate template = JtwigTemplate.classpathTemplate("templates/excerpt.html");
        JtwigModel model = JtwigModel.newModel().with("pages", buildData);
        return template.render(model);
    }
}
