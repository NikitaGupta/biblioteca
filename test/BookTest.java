import junit.framework.Assert;
import org.junit.Test;

public class BookTest {
    Book book1 = new Book(101,"Kite Runner","Khaled Hosseini",false);
    Book book2 = new Book(101,"Kite Runner","Khaled Hosseini",false);
    Book book3 = new Book(3, "Angels and Demons", "Dan Brown", true);
    Book book1Reserved = new Book(1, "Kite Runner", "Khaled Hosseini", true);

    @Test
    public void shouldBeAbleToStoreAndReadABook(){
        Book book = new Book(101,"Kite Runner","Khaled Hosseini",false);
        Assert.assertEquals("101 , Kite Runner , Khaled Hosseini , Available",book.toString());
    }

    @Test
    public void shouldBeAbleToEquateTwoSameBooks(){
        Assert.assertEquals(book1,book2);
    }
    
    @Test
    public void shouldBeAbleToReturnTrueIfBookIsIssued(){
        Assert.assertTrue(book3.isReserved());
    }

    @Test
    public void shouldBeAbleToReturnFalseIfBookIsIssued(){
        Assert.assertFalse(book1.isReserved());
    }
    
    @Test
    public void shouldBeAbleToReturnTheNameOfABook(){
        Assert.assertEquals("Kite Runner",book1.getName());
    }
    
}
