import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private static List<Book> bookList = new ArrayList<Book>();

    Library(Book... books) {
        bookList.add(new Book(1, "Kite Runner", "Khaled Hosseini", false));
        bookList.add(new Book(2, "Harry Potter", "J.K.Rowling", false));
        bookList.add(new Book(3, "Angels and Demons", "Dan Brown", true));
    }

    public String getAllBooks() {
        StringBuilder list = new StringBuilder();
        for (Book book : bookList) {
            list.append(book.toString()).append(" \n");
        }
        return list.toString();
    }

    private Book getBook(String name) {
        for (Book book : bookList) {
            if (book.getName().equals(name))
                return book;
        }
        return null;
    }

    public boolean reserveBook(String name) {
        Book bookRequested = getBook(name);
        if(bookRequested==null) return false;
        if (bookRequested.reserve())
            return true;
        return false;
    }

}
