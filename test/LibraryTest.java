import junit.framework.Assert;
import org.junit.Test;

public class LibraryTest {

    Book book1 = new Book(1, "Kite Runner", "Khaled Hosseini", false);
    Book book2 = new Book(2, "Harry Potter", "J.K.Rowling", false);
    Book book3 = new Book(3, "Angels and Demons", "Dan Brown", true);

    @Test
    public void shouldBeAbleToViewAllBooks() {
        Library library = new Library(book1,book2);
        String bookList = "1 , Kite Runner , Khaled Hosseini , Available \n" +
                "2 , Harry Potter , J.K.Rowling , Available \n";

        Assert.assertEquals(bookList, library.getAllBooks());
    }
    
    @Test
    public void shouldBeAbleToReturnBookWithAGivenName(){
        Assert.assertEquals(book1,new Library(book1,book2).getBook("Kite Runner"));
    }
        
    @Test
    public void shouldBeAbleToReserveABookIfAvailable(){
        Library library = new Library(book1,book2,book3);
        Assert.assertEquals("Thank You! Enjoy the book.",library.reserveBook("Kite Runner"));
    }

    @Test
    public void shouldNotBeAbleToReserveABookIfAvailable(){
        Library library = new Library(book1,book2,book3);
        Assert.assertEquals("Sorry we don't have that book yet",library.reserveBook("Angels and Demons"));
    }

}
