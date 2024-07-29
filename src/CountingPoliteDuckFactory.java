//6510450844 Puri Limwongrujirat
public class CountingPoliteDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackPolite(new MallardDuck()));
    }
    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackPolite(new RedheadDuck()));
    }
    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackPolite(new DuckCall()));
    }
    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackPolite(new RubberDuck()));
    }
}
