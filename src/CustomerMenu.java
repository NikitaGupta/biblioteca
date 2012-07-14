import java.util.ArrayList;

public class CustomerMenu {
    private static ArrayList<String> menu;

    CustomerMenu() {
        menu = new ArrayList<String>();
        menu.add("View all books");
        menu.add("Reserve a book");
    }


    public boolean isValidOption(int selectedOption) {
        if (selectedOption < 0 || selectedOption > menu.size()) throw new RuntimeException("Select a valid Option!");
        return true;
    }

    public String getMenu() {
        StringBuilder menuList = new StringBuilder();
        for (int index = 0; index < menu.size(); index++) {
            menuList.append(index).append(". ").append(menu.get(index)).append(" \n");
        }
        return menuList.toString();
    }
}
