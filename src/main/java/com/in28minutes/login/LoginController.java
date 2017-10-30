package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.login.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	/*@RequestMapping(value = "/login")
	public String sayHello(){
		return "Hello World dummy!";
	}*/
	
	/*@RequestMapping(value = "/login")
	@ResponseBody
	public String sayHello(){
		return "Hello World dummy!";
	}*/
	
	
	/*@RequestMapping(value = "/login")
	@ResponseBody
	public String sayHello(){
		return "login";
	}*/

	//to redirect to view resolver
	/*@RequestMapping(value = "/login")
	public String sayHello(){
		return "login";
	}*/
	
	//to handle only GET Request
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String sayHello(){
		return "login";
	}
	
	//to handle only POST Request
		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public String handleLoginRequest(@RequestParam String name,@RequestParam String password, ModelMap model){
			if(!service.validateUser(name, password)){
				model.put("errorMessage", "Invalid credntials. Please enter valid username and password!");
				return "login";
			}
				model.put("name", name);
				model.put("password", password);
				return "welcome";
		}
}