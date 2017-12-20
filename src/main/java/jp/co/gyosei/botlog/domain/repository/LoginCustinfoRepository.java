package jp.co.gyosei.botlog.domain.repository;

import jp.co.gyosei.botlog.domain.entity.LoginCustinfoEntityImpl;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginCustinfoRepository extends JpaRepository<LoginCustinfoEntityImpl, Integer>{

	LoginCustinfoRepository loginCustinfoRepository(String custid, String password, Collection<? extends GrantedAuthority> role);
	
}
