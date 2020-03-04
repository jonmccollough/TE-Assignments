package com.techelevator;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/greeting", method = RequestMethod.GET)
	public String displayGreeting(HttpSession session) {

		return "greeting";
	}
	
	
}


//print out reviews on homepage
//
//fill out form and saves review
//
//then path returns to home page and displays latest review
