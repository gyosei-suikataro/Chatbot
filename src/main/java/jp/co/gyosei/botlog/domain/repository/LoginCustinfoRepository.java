package jp.co.gyosei.botlog.domain.repository;

import jp.co.gyosei.botlog.domain.entity.LoginCustinfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginCustinfoRepository extends JpaRepository<LoginCustinfoEntity, Integer>{

	LoginCustinfoRepository loginCustinfoRepository(String custid, String password);
	
}
