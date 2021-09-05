package Strategy;

public class NoQuackStrategy implements IQuacking {
    @Override
    public void quack() {
        System.out.println("Duck is not quacking");
    }
}
