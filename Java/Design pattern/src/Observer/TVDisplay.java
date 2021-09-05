package Observer;

public class TVDisplay implements IObserver {
    private WeatherStation weatherStation;
    public TVDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
    @Override
    public void update() {
        System.out.println("TVDisplay temp: " + weatherStation.getTemp());
    }
}
