package tba.dp.observer.WeatherStation;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
