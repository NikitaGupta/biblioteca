import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemConsole implements IConsole {


    @Override
    public void print(String s) {
        System.out.println(s);
    }

    @Override
    public String readInput() {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            input = console.readLine();
        } catch (IOException e) {
            System.out.println("Error in Reading Input !");
        }
        return input;
    }
}
