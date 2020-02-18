package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;
import com.techelevator.city.CSVCityDAO;

public class DAOExample {

	public static void main(String[] args) {
		
		CityDAO dao = getDAO();
		
		CityFun funFunFun = new CityFun(dao);
		
		City smallville = new City();
		smallville.setCountryCode("USA");
		smallville.setDistrict("KS");
		smallville.setName("Smallville");
		smallville.setPopulation(42080);
		
		funFunFun.saveCity(smallville);
		
		City theCity = funFunFun.findCityById(1);
		
	}
	
	public static CityDAO getDAO() {
		
		return new CSVCityDAO();
		
		
//		BasicDataSource worldDataSource = new BasicDataSource();
//		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
//		worldDataSource.setUsername("postgres");
//		worldDataSource.setPassword("postgres1");
//		
//		return new JDBCCityDAO(worldDataSource);
	}

}
