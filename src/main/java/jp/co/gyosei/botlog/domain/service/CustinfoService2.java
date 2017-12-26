package jp.co.gyosei.botlog.domain.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustinfoService2 {
	
	@Transactional
    public void registerCustomer(String custid,String password,Collection<? extends GrantedAuthority> role) {
		
    }
}