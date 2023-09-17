import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
