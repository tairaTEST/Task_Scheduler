import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class TaskTest {
    @Test
    public void testSimpleTaskMatches(){
        SimpleTask simpleTask = new SimpleTask( 5,"Позвонить родителям");
        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertTrue(actual);
    }
    @Test
    public void testSimpleTaskNoMatches(){
        SimpleTask simpleTask = new SimpleTask(5,"Позвонить родителям");
        boolean actual = simpleTask.matches("Написать");
        Assertions.assertFalse(actual);
    }
}
