package com.techelevator.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StoreController {

	@Autowired
	CardDao cardDao;
	
	@RequestMapping(path={"/categoryPage"}, method=RequestMethod.GET)
		public String showAllCards(@RequestParam Long categoryId, ModelMap modelHolder) {
		List<Card> cards = cardDao.getAllCards(categoryId);
		modelHolder.put("allCards", cards);
		modelHolder.put("category", cardDao.getCategoryById(categoryId));
			
		return "categoryPage";
	}
		
//		@RequestMapping(path="/detail/{id}", method=RequestMethod.GET)
//		public String showCardDetail(@PathVariable Long id, ModelMap modelHolder) {
//			for(Card c : cardDao.getAllCards()) {
//				if(c.getId().equals(id)) {
//					modelHolder.put("card", c);
//				}
//			}
//			return "productDetail";
//		}
//@RequestMapping(path="/view", method=RequestMethod.GET)
//public String showShoppingCart(HttpSession session, ModelMap modelHolder) {
//	Map<Product, Integer> productList = new HashMap<>();
//	ShoppingCart sc = (ShoppingCart) session.getAttribute("shoppingCart");
//	if(sc != null){
//		Map<Long, Integer> shoppingCartProducts = sc.getAllProducts();
//		for(Long productId : shoppingCartProducts.keySet()) {
//			Product currentProduct = productDao.getProductById(productId);
//			productList.put(currentProduct, shoppingCartProducts.get(productId));
//		}
//	}	
//	modelHolder.put("productList", productList); //now have products and quantities and can pass to the jsp
//	return "cartView";
//}

}
