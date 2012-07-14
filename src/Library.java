import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> bookList = new ArrayList<Book>();

    Library(Book...books){
        for (Book book : books) {
            bookList.add(book);
        }
    }

    public void displayBookList(IConsole console) {
        for (Book book : bookList) {
            console.print(book.toString() + "\n");
        }
    }

    public String getAllBooks() {
        StringBuffer list = new StringBuffer();
        for (Book book : bookList) {
            list.append(book.toString()).append(" \n");    
        }
        return list.toString();
    }

    public boolean isAvailableForIssue(int bookID) {
        if ( bookList.get(bookID).isReserved()) return false;
        return true;
    }

    public Book getBook(String name) {
        for (Book book : bookList) {
            if(book.getName().equals(name))
                return book;
        }
        return null;
    }

    public String reserveBook(String name) {
        Book bookRequested = getBook(name);
        if(!bookRequested.isReserved()) {
            bookRequested.reserve() ;
            return "Thank You! Enjoy the book.";
        }
        else
            return "Sorry we don't have that book yet";
    }

}
