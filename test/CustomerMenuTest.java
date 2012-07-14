import junit.framework.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class CustomerMenuTest {
    static ArrayList<String> menu = new ArrayList<String>();

    @BeforeClass
    public static  void initializeMenu() {
        menu.add("View all books");
        menu.add("Reserve a book");

    }

    @Test
    public void shouldBeAbleToDisplayMenu() {
        StringBuffer expectedMenu = new StringBuffer("MENU \n");

        for (int index = 0; index < menu.size(); index++) {
            expectedMenu.append(index).append(". ").append(menu.get(index)).append("\n");
        }

        TestConsole testConsole = new TestConsole();
        (new CustomerMenu()).displayMenu(testConsole);

        Assert.assertEquals(expectedMenu.toString(), testConsole.readConsole());
    }
    
    @Test
    public void shouldBeAbleToValidateTheOptionSelected(){
        Assert.assertTrue((new CustomerMenu()).isValidOption(1));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void shouldBeAbleToInvalidateAnOption(){
        new CustomerMenu().isValidOption(5);
    }

}
