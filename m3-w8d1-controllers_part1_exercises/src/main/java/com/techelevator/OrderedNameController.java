package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OrderedNameController {
	
	@RequestMapping(path="/orderedNameInput",method=RequestMethod.GET)
	public String orderedNameInput() {
		return "orderedNameInput";
	}
//	@RequestMapping (path="/orderedNameResult", method=RequestMethod.GET)
//	public String printColors(@ModelAttribute ColorizedName colorizedParameters, ModelMap modelHolder){
//	modelHolder.put("colorizedName", colorizedParameters);
//	return "colorizedResult";
//	}
	
}
