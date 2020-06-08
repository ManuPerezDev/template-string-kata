import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateParserShould {
    /*
    "Hello", Map -> "Hello"
    "Hello `$user`",  user=Carlos  -> "Hello Carlos"
    "Today is `$day`",  day=monday  -> "Today is monday"
    "Hello `$user`, today is `$day`",  user=Carlos, day=monday  -> "Hello Carlos, today is monday"
     */

    private TemplateParser templateParser;

    @Before
    public void setTemplate(){
        templateParser = new TemplateParser();
    }

    @Test
    public void return_same_template_if_variables_are_empty(){
        assertThat(templateParser.parse("Hello", new HashMap<String, String>())).isEqualTo("Hello");
    }

    @Test
    public void replace_variables_into_template(){
        Map<String, String> variables = new HashMap<>();
        variables.put("user", "Carlos");

        assertThat(templateParser.parse("Hello `$user`", variables)).isEqualTo("Hello Carlos");
    }
}
