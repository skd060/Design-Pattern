package Strategy;

public class FlyStrategy implements IFlying {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
