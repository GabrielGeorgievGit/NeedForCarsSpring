package bg.tuvarna.usp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import bg.tuvarna.usp.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService us;
	
	@GetMapping("/login")
	public String home() {
		return "Login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("username")String username, @ModelAttribute("password")String password) {
		System.out.println("try to login user: "+username);
		if(us.authenticate(username, password)) {
			System.out.println("successful login");
			return "redirect:/announcements";
		}
		else {
			System.out.println("unsucessful login");
			return "Login";
		}
	}
}
