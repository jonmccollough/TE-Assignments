package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;

public class CityFun {
	BasicDataSource worldDataSource;
	CityDAO dao;
	
	public CityFun() {
		worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");
		
		dao = new JDBCCityDAO(worldDataSource);
	}

	public void saveCity(City city) {
		dao.save(city);
	}
	
	public City findCityById(long id) {
		return dao.findCityById(id);
	}
	
	public List<City> findBiggerCitiesInCountry(String countryCode, City city) {
		List<City> allCitiesInMyCountryCode = dao.findCityByCountryCode(countryCode);
		
		City cityToCompareTo = dao.findCityById(city.getId());
		
		List<City> largerCitiesThanMine = new ArrayList<City>();
		
		for(City currCity : allCitiesInMyCountryCode) {
			
			if(currCity.getPopulation() > cityToCompareTo.getPopulation()) {
				largerCitiesThanMine.add(currCity);
			}
			
		}
		
		return largerCitiesThanMine;
	}
}
