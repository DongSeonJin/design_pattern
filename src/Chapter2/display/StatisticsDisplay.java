package Chapter2.display;

import Chapter2.DisplayElement;
import Chapter2.Observer;
import Chapter2.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemprature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.printf("평균, 최대, 최소 온도 : %.1f도, %.1f도, %.1f도\n", temperature, temperature, temperature);
    }
}
