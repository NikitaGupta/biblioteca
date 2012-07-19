public class Navigator {
    Library library;

    Navigator() {
        library = new Library();
    }

    public void welcomeCustomer(IConsole console) {
        writeToConsole(console, "Welcome to Biblioteca");
    }

    public void writeToConsole(IConsole console, String message) {
        console.print(message);
    }

    public String readFromConsole(IConsole console) {
        return console.readInput();
    }

    public void displayMenu(IConsole console) {
        String menu = (new CustomerMenu()).getMenu();
        writeToConsole(console, menu);
    }

    public void performAction(int choice, IConsole console) {
        if (!new CustomerMenu().isValidOption(choice))
            throw new RuntimeException();

        switch (choice) {
            case 0:
                writeToConsole(console, library.getAllBooks());
                break;

            case 1:
                if (!library.confirmLogin(console))
                    break;
                reserveBook(console);
                break;

            case 2:
                console.print("The list of movies is as follows : \n\n");
                writeToConsole(console, new MovieCollection().getAllMovies());
                break;
        }
    }

    private void reserveBook(IConsole console) {
        console.print("Enter the name of the book");
        String bookName = console.readInput();
        if (library.reserveBook(bookName))
            console.print("Thank You! Enjoy the book.");
        else
            console.print("Sorry we don't have that book yet.");
    }
}
