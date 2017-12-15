package jp.co.gyosei.botlog.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.DeleteMapping;
*/
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;

import jp.co.gyosei.botlog.domain.entity.User;
import jp.co.gyosei.botlog.domain.service.UserService;
import jp.co.gyosei.botlog.domain.repository.UserRepository;

import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("userlist")
public class UserlistController {

	@Autowired
    UserService userService;
	
	@Autowired
	UserRepository repository;
	
	
	@GetMapping
	public String list(Model model) {
		List<User> users = repository.findAll();
		model.addAttribute("users",users);
		return "userlist";
	}
	
	@PostMapping
	public String Delete(Integer no) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(no);
		for (int i = 0 ; i < list.size() ; i++){
		      Integer NO = array.get(i);
		      repository.delete(NO);
		}
		return "userlist";
	}
	
	
	
}
