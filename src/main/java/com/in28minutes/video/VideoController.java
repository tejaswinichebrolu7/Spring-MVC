package com.in28minutes.video;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name") 
public class VideoController {

	@Autowired
	private VideoService service;
	
	@RequestMapping(value = "/videos", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		String user = (String) model.get("name");
		model.addAttribute("videos", service.retrieveVideos(user));
		System.out.println(service.retrieveVideos(user));
		return "videos";
	}
	
	@RequestMapping(value = "/addVideo", method = RequestMethod.GET)
	public String showTodoPage() {
		return "addVideo";
	}

	@RequestMapping(value = "/addVideo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String desc) {
		service.addVideo((String) model.get("name"), desc, new Date(), false);
		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/videos";
	}
}
