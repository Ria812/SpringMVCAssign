package com.shop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class LoginController {
	@Autowired
	User user;
	@Autowired
	UserValidator userValidator;
	
	    
	    @RequestMapping(value = "/Login", method = RequestMethod.GET)
	    public String init(Model model) {
	        model.addAttribute("msg", "Please Enter Your Login Details");
	        return "Login";
	    }
	 
	    @RequestMapping(value = "/Login", method = RequestMethod.POST)
	    public String submit(Model model, @ModelAttribute("User") User user,BindingResult result) {
	       		
	    	UserValidator val = new UserValidator();
	    	val.validate(user,result);
	    	if(result.hasErrors())
	    	{
	    		 model.addAttribute("error", "Please enter Details");
	                return "Login";
	    	}
            if (user.getUsername().equals("ria") && user.getPassword().equals("1234")) {
	              model.addAttribute("msg", "welcome  " + user.getUsername());
	              model.addAttribute("ProductsList",new ProductsList());
	              //model.addAttribute("ProductList", new ProductsList().getMyList());
	              return "Success";
	        }
            else
	        {
	              model.addAttribute("error", "Invalid Details");
	              return "Login";
	        }
	    }
            @ModelAttribute("myList")
       	 public List<Product> fillMyList() {      	
       		List<Product> myList=new ArrayList<Product>();      		
       		myList.add(new Product("1","Laptop","Silver","50000","10"));
    		myList.add(new Product("2","Mobile","Black","15000","20"));
    		myList.add(new Product("3","Tv","Silver","60000","5"));
    		myList.add(new Product("4","Fridge","Metallic","40000","7"));
    		myList.add(new Product("5","Inverter","Grey","20000","9"));
    
       	 	return myList;
       	 }
	  

}
