package com.techelevator.city;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JDBCCityDAOIntegrationTest {

	private static final String TEST_COUNTRY = "XYZ";
	private static SingleConnectionDataSource dataSource;
	private CityDAO dao;

	/* Before any tests are run, this method initializes the datasource for testing. */
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		
		dataSource.setAutoCommit(false);
	}

	/* After all tests have finished running, this method will close the DataSource */
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}

	@Before
	public void setup() {
//		 Add XYZ country code to country table
		String sqlInsertCountry = "INSERT INTO country (code, name, continent, region, surfacearea, indepyear, population, lifeexpectancy, gnp, gnpold, localname, governmentform, headofstate, capital, code2) VALUES (?, 'Afghanistan', 'Asia', 'Southern and Central Asia', 652090, 1919, 22720000, 45.9000015, 5976.00, NULL, 'Afganistan/Afqanestan', 'Islamic Emirate', 'Mohammad Omar', 1, 'AF')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertCountry, TEST_COUNTRY);
		
		// Set up DAO
		dao = new JDBCCityDAO(dataSource);
		
//		dao = new CSVCityDAO();
	}

	/* After each test, we rollback any changes that were made to the database so that
	 * everything is clean for the next test */
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
		
//		File f = new File("new.csv");
//		f.delete();
	}

	@Test
	public void save_new_city_and_read_it_back() throws SQLException {
		// Arrange
		City newCity = getSmallville();
		
		// Act
		dao.save(newCity);
		City actualCity = dao.findCityById(newCity.getId());
		
		// Assert
		Assert.assertNotNull("Did not find city", actualCity);
		assertCitiesAreEqual(newCity, actualCity);
	}

	@Test
	public void returns_cities_by_country_code() {
		// Arrange
		City newCity = getSmallville();
		dao.save(newCity);
		
		// Act
		List<City> actualCities = dao.findCityByCountryCode(TEST_COUNTRY);
		
		// Assert
		assertEquals(1, actualCities.size());
		assertCitiesAreEqual(newCity, actualCities.get(0));
	}

	@Test
	public void returns_multiple_cities_by_country_code() {
		// Arrange
		City newCity1 = getSmallville();
		City newCity2 = getSmallville();
		City newCity3 = getSmallville();
		
		dao.save(newCity1);
		dao.save(newCity2);
		dao.save(newCity3);
		
		// Act
		List<City> actualCities = dao.findCityByCountryCode(TEST_COUNTRY);
		
		// Assert
		assertEquals(3, actualCities.size());
		assertCitiesAreEqual(newCity1, actualCities.get(0));
		assertCitiesAreEqual(newCity2, actualCities.get(1));
		assertCitiesAreEqual(newCity3, actualCities.get(2));
	}

	@Test
	public void returns_cities_by_district() {
		// Arrange
		final String district = "Krypton";
		
		City newCity1 = getSmallville();
		newCity1.setDistrict(district);
		
		City newCity2 = getSmallville();
		newCity2.setDistrict(district);
		
		dao.save(newCity1);
		dao.save(newCity2);
		
		// Act
		List<City> actualCities = dao.findCityByDistrict(district);
		
		// Assert
		assertEquals(2, actualCities.size());
		assertCitiesAreEqual(newCity1, actualCities.get(0));
		assertCitiesAreEqual(newCity2, actualCities.get(1));
	}
	
	private City getSmallville() {
		String name = "Smallville";
		String district = "South Dakota";
		int population = 134234;
		
		City newCity = new City();
		newCity.setName(name);
		newCity.setDistrict(district);
		newCity.setCountryCode(TEST_COUNTRY);
		newCity.setPopulation(population);
		
		return newCity;
	}
	
	private void assertCitiesAreEqual(City expectedCity, City actualCity) {
		Assert.assertEquals(expectedCity.getId(), actualCity.getId());
		Assert.assertEquals(expectedCity.getName(), actualCity.getName());
		Assert.assertEquals(expectedCity.getDistrict(), actualCity.getDistrict());
		Assert.assertEquals(expectedCity.getCountryCode(), actualCity.getCountryCode());
		Assert.assertEquals(expectedCity.getPopulation(), actualCity.getPopulation());
	}
}
