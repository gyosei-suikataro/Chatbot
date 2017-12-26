package jp.co.gyosei.botlog.domain.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;

import jp.co.gyosei.botlog.impl.CustinfoEntityImpl;

@Repository
public interface CustinfoRepositoryCustom extends JpaRepository<CustinfoEntityImpl, String>{

	static CustinfoEntityImpl custinfoRepositoryCustom(String custid, String password, Collection<? extends GrantedAuthority> role) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	Object findByCustid(String custid);

}