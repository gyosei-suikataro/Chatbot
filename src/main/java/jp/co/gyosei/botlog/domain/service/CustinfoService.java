package jp.co.gyosei.botlog.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import jp.co.gyosei.botlog.domain.entity.User;
import jp.co.gyosei.botlog.domain.repository.UserRepository;

@Service
public class CustinfoService {
	
	@Autowired
	private UserRepository repository;
	
	
	
	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	
	@Transactional
    public void registerUser(Integer no,String custid,String custname,String orgname,String password,String effect,String role) {
		User user = new User(no,custid,custname,orgname,passwordEncoder.encode(password),effect,role);
        repository.save(user);
    }
	
	
	
	
    
	
    
    
	
}


