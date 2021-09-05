package Strategy;

public class NoFlyStrategy implements IFlying {
    @Override
    public void fly() {
        System.out.println("Duck is not flying");
    }
}
