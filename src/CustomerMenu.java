import java.util.ArrayList;

public class CustomerMenu {
    private static ArrayList<String> menu;

    CustomerMenu() {
        menu = new ArrayList<String>();
        menu.add("View all books");
        menu.add("Reserve a book");
    }

    public void displayMenu(IConsole console) {
        console.println("MENU \n");
        for (int index = 0; index < menu.size(); index++) {
            console.println(index + ". " + menu.get(index) + "\n");
        }
    }

    public boolean isValidOption(int selectedOption) {
        if (selectedOption < 0 || selectedOption > menu.size()) throw new IllegalArgumentException("Select a valid Option!");
        return true;
    }
}
