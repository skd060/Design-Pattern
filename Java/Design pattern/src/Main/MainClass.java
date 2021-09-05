package Main;

import Observer.MobileDisplay;
import Observer.TVDisplay;
import Observer.WeatherStation;
import Strategy.*;

public class MainClass {
    public static void main(String[] args) {
//        strategy
        System.out.println("Strategy");
        Duck wildDuck = new Duck(new FlyStrategy() , new QuackStrategy(), new DisplayStrategy());
        Duck rubberDuck = new Duck(new NoFlyStrategy(), new NoQuackStrategy(), new DisplayStrategy());
        wildDuck.execute();
        rubberDuck.execute();

//        observer
        System.out.println("\n\nObserver");
        WeatherStation weatherStation = new WeatherStation();
        MobileDisplay mobileDisplay = new MobileDisplay(weatherStation);
        TVDisplay tvDisplay = new TVDisplay(weatherStation);
        weatherStation.add(mobileDisplay);
        weatherStation.add(tvDisplay);

        for(int i = 0; i < 10; i++) {
            weatherStation.notifyObserver();
        }
    }
}
