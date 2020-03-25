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

public class ParkController {

	/*
	 * 	GET api/parks
	 *  GET api/parks/{parkcode}
	 *  GET api/parks/{parkcode}/weather
	 *  PUT api/parks/temperaturePreference
	 *  GET api/parks/temperaturePreference
	 */

}
