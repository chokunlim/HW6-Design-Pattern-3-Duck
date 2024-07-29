//6510450844 Puri Limwongrujirat
import java.util.ArrayList;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();
    String name;

    public Flock(String name) {
        this.name = name;
    }

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }
    @Override
    public void quack() {
        System.out.println("Flock | " + name);
        for (int i = 0; i < quackers.size(); i++) {
            if (i == 0) {
                quackers.get(i).quack();
                quackers.get(i).quack();
            }
            quackers.get(i).quack();
        }
    }
}