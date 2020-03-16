package com.techelevator.model;

import java.util.List;

public interface FilmDAO {

	// Read
	List<Film> getAllFilms(int offset, int limit);
	Film getFilmById(Long filmId);
	
	// Create	
	Film createFilm(Film film);

	// Update
	Film replaceFilm(Film film);
	
	// Delete
	void deleteFilmById(Long filmId);
	
}