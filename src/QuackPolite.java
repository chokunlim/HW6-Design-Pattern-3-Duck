//6510450844 Puri Limwongrujirat
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class QuackPolite implements Quackable{
    Quackable quackable;

    public QuackPolite(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(baos);

        System.setOut(newOut);

        quackable.quack();

        System.out.flush();
        System.setOut(originalOut);

        String capturedOutput = baos.toString().trim();
        System.out.println(capturedOutput + " kub");
    }
}
