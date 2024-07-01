package Chapter2.display;

import Chapter2.DisplayElement;
import Chapter2.Observer;
import Chapter2.WeatherData;

public class ForeCastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public ForeCastDisplay(WeatherData weatherData) {
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
        System.out.println("기상 예보 : 날씨좋다~");
    }
}
