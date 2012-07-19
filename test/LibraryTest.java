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

    @Test
    public void shouldBeAbleToReturnTrueOnLogIn(){
        Library library = new Library();
        TestConsole console = new TestConsole();
        console.writeInput("111-1114 pwd3");
        Assert.assertTrue(library.confirmLogin(console));
    }
    
    @Test
    public void shouldBeAbleToHandleNotExistingUser(){
        Library library = new Library();
        TestConsole console = new TestConsole();
        console.writeInput("111-1154 pwd3");
        Assert.assertFalse(library.confirmLogin(console));
    }
    
    @Test
    public void shouldBeAbleToReturnTrueIfUserIsAlreadyLoggedIn(){
        Library library = new Library();
        TestConsole console = new TestConsole();
        console.writeInput("111-1113 pwd2");
        Assert.assertTrue(library.confirmLogin(console));
    }
}
