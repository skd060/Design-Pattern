package Observer;

import java.util.ArrayList;

public class WeatherStation implements IObservable {
    private int temp = 10;
    private ArrayList<IObserver> observers = new ArrayList<>();
    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        temp += 10;
        for(IObserver observer : observers) {
            observer.update();
        }
    }

    int getTemp() {
        return temp;
    }
}
