package co.gyosei.botlog.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import co.gyosei.botlog.domain.entity.User;
import co.gyosei.botlog.domain.repository.UserRepository;

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
	
	
	/*
	@Transactional
	public Page<User> getAllUser(Pageable pageable) {

        return repository.UserfindAll(pageable);
    }
    */
    
	
    
    
	
}



