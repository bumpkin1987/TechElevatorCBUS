package com.techelevator;



import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping(path="/", method= RequestMethod.GET) 
	public String showHomePage() {
		return "home"; 
	}
	
	@RequestMapping(path="/actorList", method= RequestMethod.GET) 
	public String showSearchActorForm() {
		return "actorList"; // do i need to make another initial search form jsp for the search site for actors thing? ---- blank
	}

	@RequestMapping(path="/actorsSearchResult", method= RequestMethod.POST)// this produces the result of searching for actors as the actorlist.jsp---- with the results returned to similar looking page
	public String searchActors(HttpServletRequest request, @RequestParam String search) {
    	request.setAttribute("actors", actorDao.getMatchingActors(search));
		return "actorsSearchResult";
	}
	
}
