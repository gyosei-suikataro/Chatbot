package jp.co.gyosei.botlog.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.gyosei.botlog.domain.form.LoginForm;

@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute(new LoginForm());
        return "login";
    }

}