package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view

	@RequestMapping(path="/register", method=RequestMethod.GET)
	public String showRegisterForm(Model modelHolder) {
		if(!modelHolder.containsAttribute("registration")) {
			modelHolder.addAttribute("registration", new Registration());
		}
		return "register";
	}
	
	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String submitRegisterForm(@Valid @ModelAttribute("registration") Registration registerFormValues, BindingResult result, 
			RedirectAttributes flash ) {
		if(result.hasErrors()) {
			flash.addFlashAttribute("registration", registerFormValues);
		}
		flash.addFlashAttribute("message", "You have successfully registered!");
		flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "registration", result);
		return "redirect:/registrationConfirmation";
	}
	
	// GET: /confirmation
		// Return the confirmation view
	
	@RequestMapping(path ="/registrationConfirmation", method = RequestMethod.GET)
	public String showConfirmationView(Model modelHolder) {
		return "registrationConfirmation";
	}
	
	// GET: /login
	// Return the empty login view

	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String showLoginForm(Model modelHolder) {
		if(!modelHolder.containsAttribute("login")) {
			modelHolder.addAttribute("login", new Login());
		}
		return "login";
	}
	
	// POST: /login
	// Validate the model and redirect to a confirmation page if validation is
	// successful. Return the login view (if validation fails).

	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String submitloginForm(@Valid @ModelAttribute("login") Login loginFormValues, BindingResult result, 
			RedirectAttributes flash ) {
		if(result.hasErrors()) {
			flash.addFlashAttribute("login", loginFormValues);
		}
		flash.addFlashAttribute("message", "You have successfully logged in!");
		flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "login", result);
		return "redirect:/loginConfirmation";
	}
	
	@RequestMapping(path ="/loginConfirmation", method = RequestMethod.GET)
	public String showloginView(Model modelHolder) {
		return "loginConfirmation";
	}
}
