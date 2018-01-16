package jp.co.gyosei.botlog.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	String Login() {
		return "Login";
	}

    // SpringConfig
    @RequestMapping(value = "/Login-error")
    public String LoginError(Model model) {
        model.addAttribute("LoginError", true);
        return "Login";
    }
}
