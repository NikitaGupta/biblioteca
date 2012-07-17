import java.util.ArrayList;

public class CustomerMenu {
    private ArrayList<String> menu;

    CustomerMenu() {
        menu = new ArrayList<String>();
        menu.add("View all books");
        menu.add("Reserve a book");
        menu.add("View all movies");
    }


    public boolean isValidOption(int selectedOption) {
        if (selectedOption < 0 || selectedOption > menu.size()) return false;
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
