import junit.framework.Assert;
import org.junit.Test;

public class NavigatorTest {
    @Test
    public void shouldBeAbleToDisplayWelcomeMessage(){
        TestConsole testConsole = new TestConsole();
        (new Navigator()).welcomeCustomer(testConsole);
        Assert.assertTrue(testConsole.readConsole().equals("Welcome to Biblioteca"));
    }
}
