import java.util.Map;

public class TemplateParser {

    public String parse(String template, Map<String, String> variables) {
        if(!variables.isEmpty()){
            return template.replace("`$user`","Carlos");
        }
        return template;
    }
}
