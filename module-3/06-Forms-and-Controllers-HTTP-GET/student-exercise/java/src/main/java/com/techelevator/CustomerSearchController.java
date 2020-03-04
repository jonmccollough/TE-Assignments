package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/customerList")
	public String showSearchActorForm() {
		return "customerList";
	}
    
    @RequestMapping("/searchCustomers")
    public String searchCustomers(@RequestParam String search, String sort, ModelMap modelHolder) {
    	List<Customer> matchingCustomers = customerDao.searchAndSortCustomers(search, sort);
    	modelHolder.put("customers", matchingCustomers);
    	return "customerList";
    }
}