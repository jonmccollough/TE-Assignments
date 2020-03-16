package com.techelevator.model.jdbc;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Film;
import com.techelevator.model.FilmDAO;

@Component
public class JDBCFilmDAO implements FilmDAO {

	JdbcTemplate films;
	
	@Autowired
	public JDBCFilmDAO(DataSource datasource) {
		this.films = new JdbcTemplate(datasource);
	}
	
	@Override
	public List<Film> getAllFilms(int offset, int limit) {
		String query = "SELECT f.*, fl.name AS film_language, ol.name as original_language FROM film as f "
				+ "LEFT JOIN language AS fl ON f.language_id = fl.language_id "
				+ "LEFT JOIN language AS ol ON f.original_language_id = fl.language_id "
				+ "ORDER BY title ASC LIMIT ? OFFSET ?;";
		int sqlOffset = offset * limit;
		
		SqlRowSet results = films.queryForRowSet(query,limit,sqlOffset);
				
		List<Film> filmResults = new ArrayList<Film>();
		
		while(results.next()) {
			filmResults.add(rowToFilm(results));
		}
		
		return filmResults;
	}
	
	@Override
	public Film getFilmById(Long filmId) {
		String query = "SELECT f.*, fl.name AS film_language, ol.name as original_language FROM film as f "
				+ "LEFT JOIN language AS fl ON f.language_id = fl.language_id "
				+ "LEFT JOIN language AS ol ON f.original_language_id = fl.language_id "
				+ "WHERE film_id = ?";
		
		SqlRowSet results = films.queryForRowSet(query,filmId);
		
		if(results.next()) {
			return rowToFilm(results);
		}
		else {
			return null;
		}
		
	}
	
	@Override
	public void deleteFilmById(Long filmId) {
		String sql = "DELETE FROM film WHERE film_id = ?";
		films.update(sql, filmId);
	}

	@Override
	public Film createFilm(Film film) {
		// this is a mock api endpoint, TODO write the sql
		film.setFilmId(-5);
		return film;
	}
	
	@Override
	public 	Film replaceFilm(Film film) {
		//TODO actually do the thing
		film.setFilmId(-4);
		return film;
	}
	
	private Film rowToFilm(SqlRowSet result) {
		Film f = new Film();
		f.setFilmId(result.getInt("film_id"));
		f.setTitle(result.getString("title"));
		f.setDescription(result.getString("description"));
		f.setReleaseYear(result.getInt("release_year"));
		f.setLanguageId(result.getInt("language_id"));
		f.setOriginalLanguageId(result.getInt("original_language_id"));
		f.setRentalDuration(result.getInt("rental_duration"));
		f.setRentalRate(result.getDouble("rental_rate"));
		f.setLength(result.getInt("length"));
		f.setReplacementCost(result.getDouble("replacement_cost"));;
		f.setRating(result.getString("rating"));
		f.setLanguage(result.getString("film_language"));
		f.setOriginalLanguage(result.getString("original_language"));
		
		return f;
	}

}
