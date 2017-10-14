package weatherdao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import businessObjects.Weather;

public class WeatherDAO {

	
		public void save(Weather weatherToday){
			
			try {
				FileOutputStream fileOut = new FileOutputStream("C:\\workspace\\LocalDataBases\\WeatherDAO\\"+ LocalDate.now() + "weatherIn"+ weatherToday.getCityName() + ".txt");
				String lineSeperator = System.lineSeparator();
			String weatherDataToOutput = weatherToday.getCityName() + lineSeperator + weatherToday.getStateName()
					+ lineSeperator + weatherToday.getTempHigh() + lineSeperator + weatherToday.getTempLow();
				fileOut.write(weatherDataToOutput.getBytes());
				fileOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			// assuming 
		}
}
