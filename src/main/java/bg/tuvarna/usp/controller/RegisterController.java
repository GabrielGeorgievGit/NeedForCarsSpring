package bg.tuvarna.usp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import bg.tuvarna.usp.dto.RegisterUserDTO;
import bg.tuvarna.usp.entity.User;
import bg.tuvarna.usp.service.UserService;

@Controller
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String home() {
		return "Register";
	}
	
	@PostMapping("/register")
	public String register(RegisterUserDTO user, Model model) {
		Boolean created = Boolean.FALSE;
		
		User createdUser = userService.register(user);
		if(createdUser != null) created = Boolean.TRUE;
		System.out.println("user created: " + created);
		model.addAttribute("created", created);
		
		return "redirect:/login";
	}
}