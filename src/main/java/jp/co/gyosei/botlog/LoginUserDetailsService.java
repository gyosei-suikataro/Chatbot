package jp.co.gyosei.botlog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jp.co.gyosei.botlog.LoginUser;
import jp.co.gyosei.botlog.LoginUserRepository;

@Service
public class LoginUserDetailsService implements UserDetailsService {
 
    @Autowired
    private LoginUserRepository rep;
 
    @Override
    public LoginUserDetails loadUserByUsername(String custid) throws UsernameNotFoundException {
        LoginUser user = rep.findOne(custid);
        if (user == null) {
            throw new UsernameNotFoundException("User Not Found...");
        }
        return (LoginUserDetails) new LoginUserDetails(user);
    }
}