package com.techelevator;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller 
@SessionAttributes({"color", "food", "season"})
public class HelloController {

	
	@RequestMapping(path= "/favoriteColor", method= RequestMethod.GET)
	public String displayFavoriteColor(HttpServletRequest request) {
		
		return "favoriteColor";
	}
	
	@RequestMapping(path= "/favoriteColor", method= RequestMethod.POST)
	public String saveFavoriteColor(ModelMap map, @RequestParam String color) {

			map.addAttribute("color", color);

		
		return "redirect:/favoriteFood";
	}
	 
	@RequestMapping(path= "/favoriteFood", method= RequestMethod.GET)
	public String displayFavoriteFood(HttpServletRequest request) {
		
		return "favoriteFood";
	}
	
	@RequestMapping(path= "/favoriteFood", method= RequestMethod.POST)
	public String displayFavoriteFood(ModelMap map, @RequestParam String food) {
		map.addAttribute("food", food);
		return "redirect:/favoriteSeason";
	}
	
	@RequestMapping(path= "/favoriteSeason", method= RequestMethod.GET)
	public String displayFavoriteSeason(HttpServletRequest request) {
		
		return "favoriteSeason";
	}
	
	@RequestMapping(path= "/favoriteSeason", method= RequestMethod.POST)
	public String displayFavoriteSeason(ModelMap map, @RequestParam String season) {
		map.addAttribute("season", season);
		return "redirect:/summary";
	}
	
	@RequestMapping(path= "/summary", method= RequestMethod.GET)
	public String displaySummary(HttpServletRequest request) {
		
		return "summary";
	}
	
//	@RequestMapping(path= "/summary", method= RequestMethod.POST)
//	public String displaySummary(HttpServletRequest request,Model map, Model color, Model food, Model season) {
//		//i need help
//		return "summary";
//	}
	
	
}
