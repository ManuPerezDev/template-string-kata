import java.util.Iterator;
import java.util.Map;

public class TemplateParser {

    public String parse(String template, Map<String, String> variables) {
        if(!variables.isEmpty()){
            Iterator<Map.Entry<String, String>> iterator = variables.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<String, String> pair = iterator.next();
                template = template.replace("`$" + pair.getKey() + "`", pair.getValue());
            }

            return template;
        }
        return template;
    }
}
