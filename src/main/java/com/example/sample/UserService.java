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
    public void registerUser(Integer no,String custid,String custname,String orgname,String password,String effect,String role) {
		User user = new User(no,custid,custname,orgname,passwordEncoder.encode(password),effect,role);
        repository.save(user);
    }
    
    
	
}



