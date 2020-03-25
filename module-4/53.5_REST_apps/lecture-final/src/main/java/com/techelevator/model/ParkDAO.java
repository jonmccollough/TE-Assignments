package com.techelevator.model;

import java.util.List;

public interface ParkDAO {
	
	List<Park> getAllParks();
	Park getParkByCode(String parkcode);

}
