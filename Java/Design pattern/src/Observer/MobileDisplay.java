package Observer;

public class MobileDisplay implements IObserver {
    private WeatherStation weatherStation;
    public MobileDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
    @Override
    public void update() {
        System.out.println("MobileDisplay temp: " + weatherStation.getTemp());
    }
}
