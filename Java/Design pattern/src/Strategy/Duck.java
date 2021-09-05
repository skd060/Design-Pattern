package Strategy;

public class Duck {
    private IFlying flying;
    private IQuacking quacking;
    private IDisplaying displaying;
    public Duck(IFlying flying, IQuacking quacking, IDisplaying displaying) {
        this.flying = flying;
        this.quacking = quacking;
        this.displaying = displaying;
    }

    public void execute() {
        flying.fly();
        quacking.quack();
        displaying.display();
    }
}
