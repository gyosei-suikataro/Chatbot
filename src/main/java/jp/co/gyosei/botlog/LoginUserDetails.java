package jp.co.gyosei.botlog;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jp.co.gyosei.botlog.domain.repository.CustinfoRepositoryCustom;

@Service
public class LoginUserDetails implements UserDetailsService { 
	@Override 
	public UserDetails loadUserByUsername(String s) 
			throws UsernameNotFoundException { 
		if (s==null || "".equals(s)) { 
			throw new UsernameNotFoundException("Username is empty");
		} 
		LoginCust loginCust = CustinfoRepositoryCustom.findByCustid(s); 
		if (loginCust == null) { 
			throw new UsernameNotFoundException( "User not found for name: " + s);
		} 
		return loginCust;
	}
} 