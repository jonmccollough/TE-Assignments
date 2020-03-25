package com.techelevator.model;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JDBCWeatherDAO implements WeatherDAO {

	private JdbcTemplate sql;
	
	@Autowired
	public JDBCWeatherDAO(DataSource dataSource) {
		this.sql = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Weather> getForecastForPark(String parkcode) {
		String query = "SELECT * FROM weather WHERE parkcode = ?";
		return sql.query(query, weatherMapper, parkcode);
	}	
	
	private RowMapper<Weather> weatherMapper = (row, rowNumber) -> {
		Weather w = new Weather();
		
		w.setParkCode(row.getString("parkcode"));
		w.setFiveDayForecastValue(row.getInt("fivedayforecastvalue"));
		w.setLowTemp(row.getInt("low"));
		w.setHighTemp(row.getInt("high"));
		w.setForecast(row.getString("forecast"));
		
		return w;
	};
}
