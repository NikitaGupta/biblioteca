import junit.framework.Assert;
import org.junit.Test;

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

    @Test
    public void shouldBeAbleToInvalidateAnOption() {
        Assert.assertFalse(new CustomerMenu().isValidOption(5));
    }

}
