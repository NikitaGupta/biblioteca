import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private static List<Book> bookList = new ArrayList<Book>();

    Library(Book...books){
        Collections.addAll(bookList, books);
    }

    public String getAllBooks() {
        StringBuilder list = new StringBuilder();
        for (Book book : bookList) {
            list.append(book.toString()).append(" \n");    
        }
        return list.toString();
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
