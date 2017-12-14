package jp.co.gyosei.botlog;

import jp.co.gyosei.botlog.LoginUser;

public class LoginUserDetails extends LoginUser {
 	
	private final LoginUser user;
 
    public LoginUserDetails(LoginUser user) {
        super(user.getCustid(), user.getPassword(), user.getRole());
        this.user = user;
    }
 
    public LoginUser getUser() {
        return user;
    }
 
}