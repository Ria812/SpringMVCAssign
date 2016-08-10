package com.shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsController {
	@Autowired
	ProductsList productlist;
	
	@RequestMapping(value="/Selectedproducts",method = RequestMethod.POST)
	public String selectedProductsubmit(Model model, @ModelAttribute("ProductsList") ProductsList productsList) {		
		 model.addAttribute("list",productsList.getMyList());
		 return "Selectedproducts";
		}
}
