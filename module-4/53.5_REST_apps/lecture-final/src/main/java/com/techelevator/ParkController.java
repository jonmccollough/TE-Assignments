package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.model.Park;
import com.techelevator.model.ParkDAO;
import com.techelevator.model.Weather;
import com.techelevator.model.WeatherDAO;

@RestController
@CrossOrigin
@RequestMapping("/api/parks/")
public class ParkController {

	@Autowired
	ParkDAO parkDAO;

	@Autowired
	@Qualifier("weatherAPI")
	WeatherDAO weatherDAO;
	
	// GET api/parks
	@GetMapping
	public List<Park> getParks() {
		return parkDAO.getAllParks();
	}
	
	// GET api/parks/{parkcode}
	@GetMapping("/{parkcode}")
	public Park getOnePark(@PathVariable String parkcode) {
		return parkDAO.getParkByCode(parkcode);
	}
	
	 //GET api/parks/{parkcode}/weather
	@GetMapping("/{parkcode}/weather")
	public List<Weather> getParkForecast(@PathVariable String parkcode) {
		return weatherDAO.getForecastForPark(parkcode);
	}

	 /*
	 *  PUT api/parks/temperaturePreference
	 *  GET api/parks/temperaturePreference
	 */

}
