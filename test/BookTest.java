import junit.framework.Assert;
import org.junit.Test;

public class BookTest {
    @Test
    public void shouldBeAbleToStoreAndReadABook(){
        Book book = new Book(101,"Kite Runner","Khaled Hosseini");
        Assert.assertEquals("101 , Kite Runner , Khaled Hosseini",book.toString());
        
    }
}
