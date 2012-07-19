import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> bookList = new ArrayList<Book>();
    private static List<User> userList = new ArrayList<User>();
    public final User Librarian;

    Library() {
        bookList.add(new Book(1, "Kite Runner", "Khaled Hosseini", false));
        bookList.add(new Book(2, "Harry Potter", "J.K.Rowling", false));
        bookList.add(new Book(3, "Angels and Demons", "Dan Brown", true));

        userList.add(new User("111-1112", "pwd1", false));
        userList.add(new User("111-1113", "pwd2", true));
        userList.add(new User("111-1114", "pwd3", false));
        Librarian = new User("111-1111", "Librarian", false);
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
        return bookRequested != null && bookRequested.reserve();
    }

    public boolean confirmLogin(IConsole console) {
        User user;
        console.print("Enter your UserName and Password: ");
        String[] input = console.readInput().split(" ");
        String userName= input[0];
        String password = input[1];
        
        try {
            user = getUser(userName);
            return user.isLoggedIn() || user.login(password);
        } catch (RuntimeException e) {
            console.print(e.toString());
            return false;
        }
    }

    private User getUser(String userName) {
        boolean found = false;
        User userLoggingIn = null;
        for (User user : userList) {
            if (user.hasUserName(userName)) {
                found = true;
                userLoggingIn = user;
                break;
            }
        }
        if (!found) throw new RuntimeException("User does not exist !");
        
        return userLoggingIn;
    }
}
