package weatherservice;

import businessObjects.Weather;
import utils.WUtils;
import weatherdao.WeatherDAO;

public class WeatherService {
	
		public static String saveWeather(Weather weatherToday) {
			WeatherDAO wdao = new WeatherDAO();
			
		boolean ishighlow = WUtils.highlowcheck(weatherToday.getTempHigh(),weatherToday.getTempLow());
		
			if(ishighlow) {
				wdao.save(weatherToday);
				return " Cant wish for a better DAY I Love Erica Forever";
		}
			else {
				return " I THINK YOU BETTER RETHINK THE HIGHS & LOWS " ;
			}
		}
	
	
}
