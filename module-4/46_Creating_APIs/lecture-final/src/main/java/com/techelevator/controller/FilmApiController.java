package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.model.Film;
import com.techelevator.model.FilmDAO;

@RestController
@CrossOrigin
@RequestMapping("/api/films")
public class FilmApiController {
	
	@Autowired
	private FilmDAO dao;
	
	@GetMapping
	public List<Film> get(){
		return dao.getAllFilms(0, 20);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Film create(@RequestBody Film newFilm) {
		Film filmToReturn = dao.createFilm(newFilm);
		return filmToReturn;
	}
	
	@GetMapping("/{id}")
	public Film getById(@PathVariable Long id) {
		Film myFilm = dao.getFilmById(id);
		return myFilm;
	}
	
	@PutMapping("/{id}")
	public Film replaceById(@PathVariable int id, @RequestBody Film filmToReplace) {
		Film replacedFilm = dao.replaceFilm(filmToReplace);
		return replacedFilm;
	}

	@DeleteMapping("/{id}")
	public void deleteFilmById(@PathVariable Long id) {
		dao.deleteFilmById(id);
	}
}