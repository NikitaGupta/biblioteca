import junit.framework.Assert;
import org.junit.Test;

public class MovieTest {
    @Test
    public void shouldBeAbleToStoreAndDisplayAMovie(){
        Movie firstMovie = new Movie("The Dark Knight","Christopher Nolan","9.5");
        Assert.assertEquals("The Dark Knight , Christopher Nolan , 9.5",firstMovie.toString());
    }
}
