import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MenuTest {

    @Test
    public void shouldBeAbleToDisplayMenu() {
        StringBuffer expectedMenu = new StringBuffer("MENU \n");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("View all books");
        menu.add("Reserve a book");

        for (int index=0 ;index< menu.size() ;index++) {
            expectedMenu.append(index).append(". ").append(menu.get(index)).append("\n");
        }

        TestConsole dummyConsole = new TestConsole();
        (new CustomerMenu()).displayMenu(dummyConsole);

        Assert.assertEquals(expectedMenu.toString(),dummyConsole.readConsole());
    }

}
