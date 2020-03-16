package com.techelevator.shopping.controller;

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

import com.techelevator.shopping.dao.ItemDao;
import com.techelevator.shopping.model.Item;

@RestController
@CrossOrigin
@RequestMapping("/api/groceries")
public class ShoppingController {

	@Autowired
	private ItemDao itemDao;

	@GetMapping
	public List<Item> displayList() {
		return itemDao.list();
	}

	@GetMapping("/{id}")
	public Item findItem(@PathVariable int id) {
		return itemDao.read(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createItem(@RequestBody Item item) {
		itemDao.create(item);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Item update(@RequestBody Item item, @PathVariable int id) {
		return itemDao.update(item);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void destroyItem(@PathVariable int id) {
		itemDao.delete(id);
	}
}







