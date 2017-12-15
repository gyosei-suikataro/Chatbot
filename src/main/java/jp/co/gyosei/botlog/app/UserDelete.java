/*package jp.co.gyosei.botlog.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.gyosei.botlog.domain.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("userlist")
public class UserDelete{
	
	@Autowired
	UserRepository repository;
	
	@PostMapping
	public String Delete(Integer no) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(no);
		repository.delete(list);
		
	}
	
}
*/