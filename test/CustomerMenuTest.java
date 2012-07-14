import junit.framework.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerMenuTest {

    @Test
    public void shouldBeAbleToReturnMenuAsAString() {
        String menu = "0. View all books \n1. Reserve a book \n";
        Assert.assertEquals(menu, new CustomerMenu().getMenu());
    }

    @Test
    public void shouldBeAbleToValidateTheOptionSelected() {
        Assert.assertTrue((new CustomerMenu()).isValidOption(1));
    }

    @Test(expected = RuntimeException.class)
    public void shouldBeAbleToInvalidateAnOption() {
        new CustomerMenu().isValidOption(5);
    }

}
