import junit.framework.Assert;
import org.junit.Test;

public class NavigatorTest {
    @Test
    public void shouldBeAbleToDisplayWelcomeMessage(){
        TestConsole testConsole = new TestConsole();
        (new Navigator()).welcomeCustomer(testConsole);
        Assert.assertEquals(testConsole.readConsole(), ("Welcome to Biblioteca"));
    }
    
    @Test
    public void shouldBeAbleToAcceptUserInput(){
        TestConsole testConsole = new TestConsole();
        testConsole.writeInput("Hello");
        Assert.assertNotNull(testConsole.getInput());
    }
    
    @Test
    public void shouldTestIfConsoleReturnsTheInputEnteredByTheUser() {
        TestConsole testConsole = new TestConsole();
        testConsole.writeInput("Hello");
        
        Assert.assertEquals("Hello",testConsole.getInput());
    }
}
