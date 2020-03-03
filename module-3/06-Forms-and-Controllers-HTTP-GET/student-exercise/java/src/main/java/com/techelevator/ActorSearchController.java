package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.JDBCActorDao;
import com.techelevator.dao.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping("/actorList")
	public String showSearchActorForm() {
		return "actorList";
	}

	@RequestMapping(path="/actorListSearch")
	public String searchActors(@RequestParam String last_name, ModelMap modelHolder)
			
			/* What arguments go here to get parameters from the page? */ {
		 List<Actor> matchingActors = actorDao.getMatchingActors(last_name);
		 modelHolder.put("actors", matchingActors);
		 return "actorList";
		
	}
}