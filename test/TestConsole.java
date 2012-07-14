import java.util.ArrayList;

public class TestConsole implements IConsole {

    private ArrayList<String> consoleOutput = new ArrayList<String>();
    private String consoleInput;


    @Override
    public void println(String s) {
        consoleOutput.add(s);
    }

    public String readConsole() {
        StringBuilder consoleData = new StringBuilder();
        for (String line : consoleOutput) {
            consoleData.append(line);
        }
        return consoleData.toString();
    }

    public void writeInput(Object input) {
        consoleInput = (String)input;
    }

    public String getInput() {
        return consoleInput;
    }
}
