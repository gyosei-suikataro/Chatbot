package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.sample.User;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	
	@Transactional
    public void registerUser(Integer NO,String CUSTID,String CUSTNAME,String ORGNAME,String PASSWORD,String EFFECT,String ROLE) {
		User user = new User(NO,CUSTID,CUSTNAME,ORGNAME,passwordEncoder.encode(PASSWORD),EFFECT,ROLE);
        repository.save(user);
    }
    
    
	
}



