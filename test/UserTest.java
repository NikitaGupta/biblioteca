import junit.framework.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void shouldBeAbleToCheckIfUserNameMatches() {
        User user = new User("111-1114", "pwd3", false);
        Assert.assertTrue(user.hasUserName("111-1114"));
    }

    @Test
    public void shouldBeAbleToCheckIfUserNameDoesNotMatch() {
        User user = new User("111-1114", "pwd3", false);
        Assert.assertFalse(user.hasUserName("111-1115"));
    }

    @Test
    public void shouldBeAbleToCheckIfUserIsLoggedIn() {
        User user = new User("111-1114", "pwd3", false);
        Assert.assertFalse(user.isLoggedIn());
    }

    @Test
    public void shouldBeAbleToSuccessfullyLogin() {
        User user = new User("111-1114", "pwd3", false);
        Assert.assertTrue(user.login("pwd3"));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionOnGivingWrongPassword() {
        User user = new User("111-1114", "pwd3", false);
        Assert.assertFalse(user.login("pwd5"));
    }
}
