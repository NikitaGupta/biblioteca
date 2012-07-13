import java.util.ArrayList;

public class TestConsole implements IConsole {

    private ArrayList<String> console = new ArrayList<String>();

    @Override
    public void println(String s) {
        console.add(s);
    }

    public String readConsole() {
        StringBuilder consoleData = new StringBuilder();
        for (String line : console) {
            consoleData.append(line);
        }
        return consoleData.toString();
    }

}
