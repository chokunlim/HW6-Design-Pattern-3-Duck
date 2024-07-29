//6510450844 Puri Limwongrujirat
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingPoliteDuckFactory();

        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable politeMallardDuck = duckFactory.createMallardDuck();
        Quackable politeRedheadDuck = duckFactory.createRedheadDuck();
        Quackable politeDuckCall = duckFactory.createDuckCall();
        Quackable politeRubberDuck = duckFactory.createRubberDuck();

        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        Flock goodDucks = new Flock("Good Ducks");
        goodDucks.add(politeMallardDuck);
        goodDucks.add(politeRedheadDuck);
        goodDucks.add(politeDuckCall);
        goodDucks.add(politeRubberDuck);

        Flock nonDucks = new Flock("Non Ducks");
        nonDucks.add(goose);
        nonDucks.add(pigeon);

        Flock antiPoliteDucks = new Flock("Anti Polite Ducks");
        antiPoliteDucks.add(mallardDuck);
        antiPoliteDucks.add(redheadDuck);
        antiPoliteDucks.add(duckCall);
        antiPoliteDucks.add(rubberDuck);

        Flock gooseGooseDuck = new Flock("Goose Goose Duck");
        gooseGooseDuck.add(goose);
        gooseGooseDuck.add(goose);
        gooseGooseDuck.add(duckCall);

        Flock noFriendFlock = new Flock("Alone Duck");
        noFriendFlock.add(politeDuckCall);

        System.out.println("\nDuck Simulator");

        simulate(goodDucks);
        simulate(nonDucks);
        simulate(antiPoliteDucks);
        simulate(gooseGooseDuck);
        simulate(noFriendFlock);

        System.out.println("Number of Polite Quacks = " + QuackCounter.getNumberOfQuacks());
    }
    void simulate(Quackable quackable) {
        quackable.quack();
    }
}