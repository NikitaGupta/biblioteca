import junit.framework.Assert;
import org.junit.Test;

public class LibraryTest {

    @Test
    public void shouldBeAbleToViewAllBooks() {
        Library library = new Library();
        String bookList = "1 , Kite Runner , Khaled Hosseini , Available \n" +
                "2 , Harry Potter , J.K.Rowling , Available \n" +
                "3 , Angels and Demons , Dan Brown , Issued \n";

        Assert.assertEquals(bookList, library.getAllBooks());
    }
    
    @Test
    public void shouldBeAbleToReserveABookIfAvailable(){
        Library library = new Library();
        Assert.assertTrue(library.reserveBook("Kite Runner"));
    }

    @Test
    public void shouldNotBeAbleToReserveABookIfAvailable(){
        Library library = new Library();
        Assert.assertFalse(library.reserveBook("Angels and Demons"));
    }

}
