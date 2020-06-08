import org.junit.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateShould {
    /*
    "Hello", Map -> "Hello"
    "Hello `$user`",  user=Carlos  -> "Hello Carlos"
    "Today is `$day`",  day=monday  -> "Today is monday"
    "Hello `$user`, today is `$day`",  user=Carlos, day=monday  -> "Hello Carlos, today is monday"
     */

    @Test
    public void test1(){
        Template template = new Template();

        assertThat(template.parse("Hello", new HashMap<String, String>())).isEqualTo("Hello");
    }
}
