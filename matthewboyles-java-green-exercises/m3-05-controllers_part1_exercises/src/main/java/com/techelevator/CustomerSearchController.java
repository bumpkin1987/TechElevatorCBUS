package com.techelevator;

import com.techelevator.dao.CustomerDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

//    @RequestMapping(path="/", method= RequestMethod.GET) 
//	public String showHomePage() {
//		return "home"; 
//	}
	
	@RequestMapping(path="/customerList", method= RequestMethod.GET) 
	public String showSearchCustomerForm() {
		return "customerList";
	}

	@RequestMapping(path="/customerSearchResult", method= RequestMethod.GET)
	public String showCustomers(HttpServletRequest request, @RequestParam String param, @RequestParam String sort) {
    	request.setAttribute("customers", customerDao.searchAndSortCustomers(param, sort));
		return "customerSearchResult";
	}
	
}