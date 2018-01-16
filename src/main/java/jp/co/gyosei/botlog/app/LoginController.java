package jp.co.gyosei.botlog.app;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.gyosei.botlog.domain.entity.MyUserDetails;
/*
import jp.co.gyosei.botlog.LoginCust;
import jp.co.gyosei.botlog.domain.form.LoginForm;
*/
@Controller
public class LoginController {

	@RequestMapping("/")
	String Login() {
		return "Login";
	}
/*	
	@RequestMapping(value = "/")
	public String Login(Model model) {
		model.addAttribute(new LoginForm());
		return "Login";
	}

    // SpringConfigで設定したログインできなかった場合の処理を定義する
    @RequestMapping(value = "/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "Login";
    }
*/
    @RequestMapping(value = "/menu")
    public String Menu(@AuthenticationPrincipal MyUserDetails myUserDetails, Model model) {
        // @AuthenticationPrincipalを使うと認証オブジェクトを参照できる。

        return "menu";
    }

}
