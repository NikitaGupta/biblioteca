import junit.framework.Assert;
import org.junit.Test;

public class BookTest {
    Book book1 = new Book(101, "Kite Runner", "Khaled Hosseini", false);
    Book book2 = new Book(101, "Kite Runner", "Khaled Hosseini", false);

    @Test
    public void shouldBeAbleToStoreAndReadABook() {
        Book book = new Book(101, "Kite Runner", "Khaled Hosseini", false);
        Assert.assertEquals("101 , Kite Runner , Khaled Hosseini , Available", book.toString());
    }

    @Test
    public void shouldBeAbleToEquateTwoSameBooks() {
        Assert.assertEquals(book1, book2);
    }

    @Test
    public void shouldBeAbleToReserveABook() {
        Assert.assertTrue(book1.reserve());
    }
}
