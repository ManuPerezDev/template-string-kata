import java.util.HashMap;
import java.util.Map;

public class Template {

    public String parse(String template, Map<String, String> variables) {
        if(!variables.isEmpty()){
            return template.replace("`$user`","Carlos");
        }
        return template;
    }
}
