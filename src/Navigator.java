public class Navigator {

    public void welcomeCustomer(IConsole console) {
        writeToConsole(console, "Welcome to Biblioteca");
    }

    public void writeToConsole(IConsole console, String message) {
        console.print(message);
    }

    public String readFromConsole(IConsole console) {
        return console.readInput();
    }
}
