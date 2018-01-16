package jp.co.gyosei.botlog.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jp.co.gyosei.botlog.domain.entity.MyUserDetails;
import jp.co.gyosei.botlog.domain.repository.LoginRepository;

@Service
public class MyUserDetailsService implements UserDetailsService { 
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Override 
	public UserDetails loadUserByUsername(String s) 
			throws UsernameNotFoundException { 
		if (s==null || "".equals(s)) { 
			throw new UsernameNotFoundException("Username is empty");
		} 
		MyUserDetails myUserDetails = loginRepository.findByCustid(s); 
		if (myUserDetails == null) { 
			throw new UsernameNotFoundException( "User not found for name: " + s);
		}
		return myUserDetails;
	}
} 