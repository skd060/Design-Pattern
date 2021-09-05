package Main;

import Strategy.*;

public class MainClass {
    public static void main(String[] args) {
        Duck wildDuck = new Duck(new FlyStrategy() , new QuackStrategy(), new DisplayStrategy());
        Duck rubberDuck = new Duck(new NoFlyStrategy(), new NoQuackStrategy(), new DisplayStrategy());

        wildDuck.execute();
        rubberDuck.execute();
    }
}
