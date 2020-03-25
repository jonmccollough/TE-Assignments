package com.techelevator.model;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JDBCParkDAO implements ParkDAO {

	private JdbcTemplate sql;
	
	@Autowired
	public JDBCParkDAO(DataSource dataSource) {
		this.sql = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Park> getAllParks() {
		String query = "SELECT * FROM park ORDER BY parkcode";
		return sql.query(query, parkMapper);
	}
	
    @Override
    public Park getParkByCode(String parkcode) {
        String query = "SELECT * FROM park WHERE parkcode = ?";
        return sql.queryForObject(query, parkMapper, parkcode);
    }
	
	private RowMapper<Park> parkMapper = (r, rowNum) -> {
		Park p = new Park();
		p.setAcreage(r.getInt("acreage"));
		p.setAnnualVisitorCount(r.getInt("annualvisitorcount"));
		p.setClimate(r.getString("climate"));
		p.setDescription(r.getString("parkdescription"));
		p.setElevationInFeet(r.getInt("elevationinfeet"));
		p.setMilesOfTrail(r.getDouble("milesoftrail"));
		p.setNumberOfCampsites(r.getInt("numberofcampsites"));
		p.setYearFounded(r.getInt("yearfounded"));
		p.setEntryFee(r.getInt("entryfee"));
		p.setInspirationalQuote(r.getString("inspirationalquote"));
		p.setInspirationalQuoteSource(r.getString("inspirationalquotesource"));
		p.setNumberOfAnimalSpecies(r.getInt("numberofanimalspecies"));
		p.setParkCode(r.getString("parkcode"));	
		p.setParkName(r.getString("parkname"));
		p.setState(r.getString("state"));
		
		return p;
	};

}
