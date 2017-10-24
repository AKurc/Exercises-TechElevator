package com.techelevator.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class CardCategoryController {
	
	@Autowired
	CardDao cardDao;
	
//	@RequestMapping(path="/cardCategory", method=RequestMethod.GET)
//	public String showProductList(ModelMap modelHolder) {
//		List<Card> allCards = cardDao.getAllCards();
//		modelHolder.put("cardCategory", allCards);
//		return "cardList";
//	}
	@RequestMapping(path="/cardPage", method=RequestMethod.GET)
	public String showRelationshipView(@RequestParam Long id, ModelMap modelHolder) {
		Card c = cardDao.getCardById(id);
		modelHolder.put("card", c);
		return "cardDetail";
	}
	
}