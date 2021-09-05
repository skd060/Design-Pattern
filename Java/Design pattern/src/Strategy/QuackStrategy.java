package Strategy;

public class QuackStrategy implements IQuacking {
    @Override
    public void quack() {
        System.out.println("Duck is quacking");
    }
}
