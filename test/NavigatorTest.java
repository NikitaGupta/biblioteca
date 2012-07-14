import junit.framework.Assert;
import org.junit.Test;

public class NavigatorTest {
    
    @Test
    public void shouldBeAbleToWriteToConsole(){
        TestConsole testConsole = new TestConsole();        
        new Navigator().writeToConsole(testConsole,"Hello");
        Assert.assertEquals("Hello",testConsole.readConsole());
    }
    
    @Test
    public void shouldBeAbleToReadFromConsole(){
        TestConsole testConsole = new TestConsole();
        testConsole.writeInput("1");
        
        Assert.assertEquals(1,Integer.parseInt(new Navigator().readFromConsole(testConsole)));
    }

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
        Assert.assertNotNull(testConsole.readInput());
    }
    
    @Test
    public void shouldTestIfConsoleReturnsTheInputEnteredByTheUser() {
        TestConsole testConsole = new TestConsole();
        testConsole.writeInput("Hello");
        Assert.assertEquals("Hello",testConsole.readInput());
    }

}
