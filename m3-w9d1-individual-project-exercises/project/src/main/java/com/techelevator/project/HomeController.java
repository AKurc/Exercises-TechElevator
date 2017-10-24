package com.techelevator.project;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class HomeController {
	@Autowired
	CardDao cardDao;
	
	@RequestMapping("/")
	public String displayGreeting(ModelMap modelHolder) {
		modelHolder.put("categories", cardDao.getAllCategories());
		return "homePage";
	}
}
