package jp.co.gyosei.botlog;

import jp.co.gyosei.botlog.domain.entity.User;

public class LoginUserDetails extends User {
 
    private final User user;
 
    public LoginUserDetails(User user) {
        super(user.getCustid(), user.getPassword(), user.getRole());
        this.user = user;
    }
 
    public User getUser() {
        return user;
    }
 
}