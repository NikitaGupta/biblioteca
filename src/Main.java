public class Main {
    public static void main(String[] args) {
        SystemConsole console = new SystemConsole();
        Navigator navigator = new Navigator();
        int choice = 0;

        navigator.welcomeCustomer(console);

        System.out.println("\n :: MENU :: \n");
        navigator.displayMenu(console);

        System.out.print("\n Enter choice : ");
        choice=Integer.parseInt(navigator.readFromConsole(console));
        try{
            navigator.performAction(choice,console);
        }catch (Exception e){
            console.print("\n\n Wrong choice !!");
        }

    }
}
