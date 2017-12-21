package jp.co.gyosei.botlog.domain.repository;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntity;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;

@Repository
public interface CustinfoRepositoryCustom extends JpaRepository<CustinfoEntity, String>{

	CustinfoRepositoryCustom authCustom(String custid, String password, Collection<? extends GrantedAuthority> role);
	
}
