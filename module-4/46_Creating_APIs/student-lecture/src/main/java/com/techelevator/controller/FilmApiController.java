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

// 1 - declare it's a rest controller
// 2 - solve the cross origin problem
// 3 - create a request mapping
public class FilmApiController {
	
	// 4 - autowire the filmDAO
	
	// 5 - create the GET mapping to list all films
	
	// 6 - create a POST mapping to create a film
	
	// 7 - create a GET mapping to get a single film by ID
	
	// 8 - create a PUT mapping to update a film

	// 9 - create a DELETE mapping to delete a film by ID
}