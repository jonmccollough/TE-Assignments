package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class HelloController {

	@Autowired
	private ReviewDao reviewDao;
	
	@RequestMapping(path="/greeting")
	public String displayGreeting(ModelMap modelHolder) {
		List<Review> getAllReviews = reviewDao.getAllReviews();
		modelHolder.put("reviews", getAllReviews);
	
		return "greeting";
	}
	
	@RequestMapping(path="/review", method = RequestMethod.GET)
	public String showReview() {
		return "review";
	}
	
	@RequestMapping(path = "/review", method = RequestMethod.POST)
	public String saveInput(Review userReview) {
		userReview.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(userReview);
		return "redirect:/greeting";
	}
	
}
