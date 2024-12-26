package com.ty.job_portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Generalcontroller {
	
	@GetMapping("/")
	public String loadHome() {
		return "home.html";
	}
	
	@GetMapping("/home.html")
	public String loadHome1() {
		return "home.html";
	}
	
	@GetMapping("/aboutus.html")
		public String aboutus() {
		return "aboutus.html";
	}
	
	@GetMapping("/services.html")
	public String services() {
		return "services.html";
	}
	
	@GetMapping("/terms.html")
	public String terms() {
		return "terms.html";
	}
}
