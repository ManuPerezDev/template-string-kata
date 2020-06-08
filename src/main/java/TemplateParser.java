import java.util.Map;

public class TemplateParser {

    public String parse(String template, Map<String, String> variables) {
        if(!variables.isEmpty()){
            Map.Entry<String, String> pair = variables.entrySet().iterator().next();
            return template.replace("`$" + pair.getKey() + "`", pair.getValue());
        }
        return template;
    }
}
