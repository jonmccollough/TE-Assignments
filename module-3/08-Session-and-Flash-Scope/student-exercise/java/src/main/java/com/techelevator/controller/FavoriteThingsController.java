package com.techelevator.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.FavoriteThings;

@Controller
@RequestMapping("/FavoriteThings")
public class FavoriteThingsController {

	@RequestMapping(path = "/Page1", method = RequestMethod.GET)
	public String getPage1(ModelMap map) {
		return "page1";
	}
	
	@RequestMapping(path="/Page1", method=RequestMethod.POST)
	public String redirectPage2(@RequestParam String color, HttpSession session) {
		session.setAttribute("color", color);
		return "redirect:/FavoriteThings/Page2";
	}
	
	@RequestMapping(path = "/Page2", method = RequestMethod.GET)
	public String getPage2(ModelMap map) {
		return "page2";
	}
	
	@RequestMapping(path="/Page2", method=RequestMethod.POST)
	public String redirectPage3(@RequestParam String food, HttpSession session, RedirectAttributes redirectAttributes) {
		session.setAttribute("food", food);
		return "redirect:/FavoriteThings/Page3";
	}
	
	@RequestMapping(path = "/Page3", method = RequestMethod.GET)
	public String getPage3(ModelMap map) {
		return "page3";
	}
	
	@RequestMapping(path="/Page3", method=RequestMethod.POST)
	public String redirectSummary(@RequestParam String season, HttpSession session, RedirectAttributes redirectAttributes) {
		session.setAttribute("season", season);
		return "redirect:/FavoriteThings/FavoriteThingsSummary";
	}
	
	@RequestMapping(path="/FavoriteThingsSummary", method=RequestMethod.GET)
	public String summary(HttpSession session, RedirectAttributes redirectAttributes, ModelMap map) {
		
		FavoriteThings things = new FavoriteThings();
		
		String color1 = (String) session.getAttribute("color");
		String food1 = (String) session.getAttribute("food");
		String season1 = (String) session.getAttribute("season");
		
		things.setColor(color1);
		things.setFood(food1);
		things.setSeason(season1);
		map.addAttribute(things);
		
		return "favoriteThingsSummary";
	}

}


//@RequestMapping(path = "/review", method = RequestMethod.POST)
//public String saveInput(Review userReview) {
//	userReview.setDateSubmitted(LocalDateTime.now());
//	reviewDao.save(userReview);
//	return "redirect:/greeting";
//}