package jp.co.gyosei.botlog.domain.repository;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntityImpl;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;

@Repository
public interface CustinfoRepositoryCustom extends JpaRepository<CustinfoEntityImpl, String>{

	static CustinfoEntityImpl custinfoRepositoryCustom(String custid, String password/*, Collection<? extends GrantedAuthority> role*/) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}