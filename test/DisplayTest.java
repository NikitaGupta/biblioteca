import junit.framework.Assert;
import org.junit.Test;
import org.junit.internal.matchers.StringContains;

public class DisplayTest {
    @Test
    public void shouldBeAbleToDisplayWelcomeMessage(){
        String expectedWelcomeMessage = "Welcome to Biblioteca !";
        Assert.assertTrue(expectedWelcomeMessage.equals ((new Display()).getWelcomeMessage()));
    }
}
