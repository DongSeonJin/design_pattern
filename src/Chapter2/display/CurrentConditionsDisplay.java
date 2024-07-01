package Chapter2.display;

import Chapter2.DisplayElement;
import Chapter2.Observer;
import Chapter2.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
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
        System.out.printf("현재 상태 : 온도 %.1f도, 습도 %.1f%% \n", temperature, humidity);
    }
}
