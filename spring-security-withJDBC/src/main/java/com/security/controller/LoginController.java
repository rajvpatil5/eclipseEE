package com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showloginpage")
	public String showLoginForm() {
		return "fancy-login";
	}
	@GetMapping("/access-denied")
	public String accessDenied() {
		return "accessdenied";
	}
}
