package jp.co.gyosei.botlog.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.gyosei.botlog.domain.repository.CustinfoRepositoryCustom;
import jp.co.gyosei.botlog.impl.CustinfoEntityImpl;

@Service
public class CustinfoService2 {
	
	@Autowired
	private CustinfoRepositoryCustom custinfoRepositoryCustom;
	
	@Transactional
    public void registerCustomer(String custid,String password,String role) {
		
    }
}