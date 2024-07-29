//6510450844 Puri Limwongrujirat
public class QuackCounter implements Quackable {
    Quackable quackable;
    private static int numberOfQuacks;

    public QuackCounter (Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}