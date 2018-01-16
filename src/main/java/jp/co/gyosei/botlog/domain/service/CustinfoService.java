/*
package jp.co.gyosei.botlog.domain.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntity;
import jp.co.gyosei.botlog.domain.repository.CustinfoRepository;

@Service
public class CustinfoService {

	@Autowired
	private CustinfoRepository custinfoRepository;	

	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Transactional
	public void registerCustomer(Integer no,String custid,String custname,String orgname,String password,String effect,Collection<? extends GrantedAuthority> role) {
		CustinfoEntity custinfoEntity = new CustinfoEntity(no,custid,custname,orgname,passwordEncoder.encode(password),effect,role);
		custinfoRepository.save(custinfoEntity);
	}

	public void registerCustomer(Integer no, String custid, String custname, String orgname, String password,
			String effect, String role) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}
}
*/