package com.log.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.log.dao.UsersProfileDao;
import com.log.entity.UsersProfile;
import com.log.rest.DuplicateEmailException;
import com.log.service.UsersProfileServiceImpl;

@Controller
public class LoginController {

	@Autowired
	private UsersProfileServiceImpl usersProfileServiceImpl;

	@Autowired
	private UsersProfileDao usersProfileDao;

	@GetMapping("/registration")
	public String homePage(Model theModel) {
		UsersProfile registration = new UsersProfile();
		theModel.addAttribute("regi", registration);
		return "registration";
	}

	

	@PostMapping("/register")
	public String rigester(@ModelAttribute("regi") UsersProfile user, Errors errors,
			RedirectAttributes redirectAttributes) {

		List<UsersProfile> findemailId = usersProfileDao.findemailId(user.getEmailId());
		if (findemailId.isEmpty()) {
			usersProfileServiceImpl.saveUserProfile(user);
		} else {
			redirectAttributes.addFlashAttribute("errorMessage", "We couldn't process your order!");
			return "redirect:/registration";
		}

		return "redirect:/registration";
	}

}
