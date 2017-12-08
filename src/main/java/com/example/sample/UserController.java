package com.example.sample;

//import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;

//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;

import com.example.sample.UserService;
import com.example.sample.UserRepository;

//import java.util.List;

@Controller
public class UserController {

	@Autowired
    UserService userService;
	
	@Autowired
	UserRepository repository;
	
	
	//“o˜^
	@GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "signup";
    }
	
	@PostMapping("/signup")
    public String signupPost(Model model, @Valid UserForm userForm, BindingResult bindingResult, HttpServletRequest request) {
		userService.registerUser(userForm.getNo,userForm.getCustid(),userForm.getCustname(),userForm.getOrgname(),userForm.getPassword(),"1","USER");
		return "signup";
	}
	
	
}
