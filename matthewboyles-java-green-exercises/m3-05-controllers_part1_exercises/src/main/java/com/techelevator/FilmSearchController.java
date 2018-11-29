package com.techelevator;

import com.techelevator.dao.FilmDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;

    public String showFilmSearchForm() {
        return null;
    }
    @RequestMapping(path= "/filmList", method= RequestMethod.GET)
    public String searchFilms(HttpServletRequest request) {
    	return "filmList";
    }
    
    @RequestMapping(path="/filmSearchResult", method= RequestMethod.GET)
	public String searchActors(HttpServletRequest request, @RequestParam String genre, @RequestParam int minLength, @RequestParam int maxLength) {
    	request.setAttribute("films", filmDao.getFilmsBetween(genre, minLength, maxLength));
		return "filmSearchResult";
	}
    
}