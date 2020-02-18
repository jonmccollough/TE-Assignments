package com.techelevator.city;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVCityDAO implements CityDAO {
	private final String FILE_NAME = "new.csv";
	private long idCounter = 1;
	
	public CSVCityDAO() {
		File f = new File(FILE_NAME);
		if(f.exists()) {
			updateIdCounter();
		}
	}
	
	@Override
	public void save(City newCity) {
		try (FileWriter csvWriter = new FileWriter(FILE_NAME, true)) {
			newCity.setId(idCounter);
			csvWriter.append(String.valueOf(idCounter));
			idCounter++;
			csvWriter.append(",");
			csvWriter.append(newCity.getName());
			csvWriter.append(",");
			csvWriter.append(newCity.getCountryCode());
			csvWriter.append(",");
			csvWriter.append(newCity.getDistrict());
			csvWriter.append(",");
			csvWriter.append(String.valueOf(newCity.getPopulation()));
			csvWriter.append("\n");
			
		} catch(IOException e) {
			e.printStackTrace();		
		}
	}

	@Override
	public City findCityById(long id) {
		
		try(BufferedReader csvReader = new BufferedReader(new FileReader(FILE_NAME))) {
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    
			    if(data[0].equals(String.valueOf(id))) {
			    	return mapCity(data);
			    }
			}
		} catch(IOException e) {
			e.printStackTrace();		
		}
		
		return null;
	}

	@Override
	public List<City> findCityByCountryCode(String countryCode) {
		List<City> cities = new ArrayList<>();
		
		try(BufferedReader csvReader = new BufferedReader(new FileReader(FILE_NAME))) {
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    
			    if(data[2].equals(countryCode)) {
			    	City city = mapCity(data);
			    	cities.add(city);
			    }
			}
		} catch(IOException e) {
			e.printStackTrace();		
		}
		
		return cities;
	}

	@Override
	public List<City> findCityByDistrict(String district) {
		List<City> cities = new ArrayList<>();
		
		try(BufferedReader csvReader = new BufferedReader(new FileReader(FILE_NAME))) {
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    
			    if(data[3].equals(district)) {
			    	City city = mapCity(data);
			    	cities.add(city);
			    }
			}
		} catch(IOException e) {
			e.printStackTrace();		
		}
		
		return cities;
	}

	@Override
	public void update(City city) {
		List<String> allFileData = new ArrayList<>();
		
		try(BufferedReader csvReader = new BufferedReader(new FileReader(FILE_NAME))) {
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    
			    if(data[0].equals(String.valueOf(city.getId()))) {
			    	String updateRow = city.getId().toString() + 
			    			"," + city.getName() + "," + city.getCountryCode() + 
			    			"," + city.getDistrict() + "\n";
			    	
			    	allFileData.add(updateRow);
			    } else {
			    	allFileData.add(row);
			    }
			}
		} catch(IOException e) {
			e.printStackTrace();		
		}
		
		writeFileFromList(allFileData);
	}

	@Override
	public void delete(long id) {
		List<String> allFileData = new ArrayList<>();
		
		try(BufferedReader csvReader = new BufferedReader(new FileReader(FILE_NAME))) {
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    
			    if(data[0].equals(String.valueOf(id)) == false) {
			    	allFileData.add(row);
			    }
			}
		} catch(IOException e) {
			e.printStackTrace();		
		}
		
		writeFileFromList(allFileData);
	}
	
	private void writeFileFromList(List<String> list) {
		try (FileWriter csvWriter = new FileWriter(FILE_NAME, false)) {
			for(String s : list) {
				csvWriter.append(s);
			}
		} catch(IOException e) {
			e.printStackTrace();		
		}
	}
	
	private void updateIdCounter() {
		try(BufferedReader csvReader = new BufferedReader(new FileReader(FILE_NAME))) {
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
				long currId = Long.parseLong(data[0]);
				
				if(currId >= idCounter) {
					idCounter = currId + 1;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private City mapCity(String[] data) {
		City city = new City();
    	city.setId(Long.parseLong(data[0]));
    	city.setName(data[1]);
    	city.setCountryCode(data[2]);
    	city.setDistrict(data[3]);
    	city.setPopulation(Integer.parseInt(data[4]));
    	
    	return city;
	}

}
