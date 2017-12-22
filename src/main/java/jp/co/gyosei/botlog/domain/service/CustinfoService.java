package jp.co.gyosei.botlog.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntityImpl;
import jp.co.gyosei.botlog.domain.repository.CustinfoRepositoryCustom;

@Service
public class CustinfoService {
	
	@Autowired
	private CustinfoRepositoryCustom custinfoRepositoryCustom;
	
	//private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	@Transactional
    public void registerCustomer(String custid, String password, String role) {
		CustinfoEntityImpl custinfoEntityImpl = new CustinfoEntityImpl(custid, password, role);
		custinfoRepositoryCustom.save(custinfoEntityImpl);
    }
	
	
	
	
    
	
    
    
	
}



