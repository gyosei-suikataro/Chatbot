package com.example.sample;

/*
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
*/

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;


//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/*
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.DeleteMapping;
*/
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


import com.example.sample.UserService;
import com.example.sample.UserRepository;

import java.util.List;

@Controller
@RequestMapping("userlist")
public class UserlistController {

	@Autowired
    UserService userService;
	
	@Autowired
	UserRepository repository;
	
	
	
	//一覧表示
	@GetMapping
	public String list(Model model) {
		List<User> users = repository.findAll();
		model.addAttribute("users",users);
		return "userlist";
	}
	
	//削除
	/*
	@DeleteMapping(path = "{no}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteUser(@PathVariable Integer no) {
        repository.delete(no);
        return "userlist";   
    }
    */
	
	
	//削除
	@PostMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void delete(@RequestParam Integer no) {
		repository.delete(no);
	}
	

	
}
