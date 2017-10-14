package frontend;

import java.util.Scanner;

import businessObjects.Weather;
import weatherservice.WeatherService;

public class WeatherApp {
public static void main(String[] args) {
	
	System.out.println("Plese ENTER City Name");
	String cityName = new Scanner(System.in).nextLine();
	System.out.println("Please ENTER State Name");
	String stateName = new Scanner(System.in).nextLine();
	System.out.println("ENTER A Number From 50-100");
	int tempHigh = new Scanner(System.in).nextInt();
	System.out.println("ENTER A Number From 0-60");
	int tempLow = new Scanner(System.in).nextInt();
	
	Weather weatherToday = new Weather();
		weatherToday.setCityName(cityName);
		weatherToday.setStateName(stateName);
		weatherToday.setTempHigh(tempHigh);
		weatherToday.setTempLow(tempLow);
		
		WeatherService service = new WeatherService();
		System.out.println(WeatherService.saveWeather(weatherToday));
		
		
}

}

